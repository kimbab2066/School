package Java.과제5;

public class ComplexNumber {
	double real;
	double imag;

	public ComplexNumber(double r, double i) {
		real = r;
		imag = i;
	}

	ComplexNumber addComplex(ComplexNumber c) {
		ComplexNumber c0 = new ComplexNumber(0, 0);
		c0.real = real + c.real;
		c0.imag = imag + c.imag;
		return c0;
	}

	ComplexNumber subComplex(ComplexNumber c) {
		ComplexNumber c0 = new ComplexNumber(0, 0);
		c0.real = real - c.real;
		c0.imag = imag - c.imag;
		return c0;
	}

	ComplexNumber mulComplex(ComplexNumber c) {
		ComplexNumber c0 = new ComplexNumber(0, 0);
		c0.real = real * c.real - imag * c.imag;
		c0.imag = real * c.imag + imag * c.real;
		return c0;
	}

	ComplexNumber divComplex(ComplexNumber c) {
		ComplexNumber c0 = new ComplexNumber(0, 0);
		c0.real = (real * c.real + imag * c.imag) / (c.real * c.real + c.imag * c.imag);
		c0.imag = (imag * c.real - real * c.imag) / (c.real * c.real + c.imag * c.imag);
		return c0;
	}

	public String toString() {
		return "(" + real + ", " + imag + "i)";
	}
}// class