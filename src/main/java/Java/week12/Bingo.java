package Java.week12;
import java.util.LinkedList;
import java.util.Random;

public class Bingo extends Thread {
   static final int SIZE = 5; // 빙고 크기
   static int[][] bingotalbe = new int[SIZE][SIZE]; // 빙고 배열
   static boolean[][] check_bingotalbe = new boolean[SIZE][SIZE]; // 빙고 체크 확인용 베열
   static boolean[] select_arr = new boolean[SIZE*SIZE]; // 선택한 숫자 확인용 배열
   static LinkedList<Integer> select_arr2 = new LinkedList<Integer>(); // 선택한 숫자 배열
   static boolean playing = false; // 빙고 실행중 판별
   static int bingo_count = 0; // 빙고 줄 개수 확인
   
   public void run() { // 쓰레드
      Start();
      try {
         while(playing) {
            Thread.sleep(1000); // 1초 대기
            
            int temp = RandomNum(select_arr)+1;
            select_arr2.add(temp);
            
            Check(temp);
            Display();
         }
      }
      catch(Exception e){
         System.out.println(e + "\n" + e.getStackTrace()[0].getLineNumber());
      }
   } // public void run end

   public static void main(String[] args) {
      Thread t = new Bingo();
      t.start(); // 쓰레드 실행
      
      try {
         t.join(); // 쓰레드 실행 중 대기
      }
      catch (Exception e) {
         
      }
   } // void main end
   
   void Start() { // 빙고 시작 밑 셋팅 메소드
      boolean[] temp_arr = new boolean[SIZE*SIZE]; // 숫자 확인 용
      
      for(int i=0; i<SIZE; i++) {
         for(int j=0; j<SIZE; j++) {
            int temp = RandomNum(temp_arr); // temp = index
            bingotalbe[i][j] = temp+1;
         }
      }
      
      playing = true; // 빙고 시작
   } // void Start end
   
   int[] FindIndex(int check) { // 인덱스 찾기
      int col=0, row=0; // 열, 행
      for(col=0; col<SIZE; col++) { // 체크한 숫자의 인덱스 찾기
         for(row=0; row<SIZE; row++) {
            if(bingotalbe[col][row] == check) {
               check_bingotalbe[col][row] = true;
               return new int[] {col, row};
               // 빙고 확인 배열 체크
            }
         }
      }
      System.out.println("인덱스 찾기 실패");
      return new int[] {};
   } // int[] FindIndex end
   
   void Check(int check) { // 빙고 체크 메소드
      int[] index = FindIndex(check);
      if(index.length == 0) return;
      
      int col_count=0,row_count=0, cross1_count=0, cross2_count=0; // 빙고 확인용 카운트
      for(int i=0; i<SIZE; i++) {
         if(check_bingotalbe[i][index[1]]) col_count++;
         if(check_bingotalbe[index[0]][i]) row_count++;
         if(index[0] == index[1] && check_bingotalbe[i][i]) cross1_count++; 
         if(index[0] == SIZE-1-index[1] && check_bingotalbe[i][SIZE-1-i]) cross2_count++; 
      }
      if(col_count == SIZE) bingo_count++;
      if(row_count == SIZE) bingo_count++;
      if(cross1_count == SIZE) bingo_count++;
      if(cross2_count == SIZE) bingo_count++;
      // 카운트가 행열크기와 동일할 때 빙고 +1
      System.out.printf("(%d) [%d, %d] %d, %d, %d, %d\n", bingo_count, index[0], index[1], col_count,row_count, cross1_count, cross2_count);
      if(bingo_count >= 3) playing = false; // 빙고가 3개일 때 종료
   } // void Check end
   
   void Display() { // 빙고 화면 출력 메소드
      for(int i=0; i<SIZE; i++) {
         for(int j=0; j<SIZE; j++) {
            if(select_arr2.contains(bingotalbe[i][j])) // 선택한 목록에 있을 때 * 출력
               System.out.print("   *");
            else                              // 없을 때 숫자 출력
               System.out.printf("%4d", bingotalbe[i][j]);
         }
         System.out.println();
      }
      System.out.print("선택된 수 : ");
      for(int selected : select_arr2) System.out.print(selected + " "); // 선택한 수 출력
      if(!playing) System.out.printf("(%d번쨰 빙고!)", (select_arr2.size())); // 빙고 완성 횟수 출력
      System.out.println("\n###############################");
   } // void Display end

   int RandomNum(boolean[] arr) {
      Random rnd = new Random();
      int temp;
      do {
         temp = rnd.nextInt(SIZE*SIZE);
      } while(arr[temp]);
      arr[temp] = true;
      return temp;
   } // int RandomNum end
} // class Bingo end