
class Complex {

    private float real;
    private float imaginary;

    Complex() {
    }

    Complex(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex plus(Complex c) {
        Complex sum = new Complex();
        sum.real = real + c.real;
        sum.imaginary = imaginary + c.imaginary;
        return sum;
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1.7f, 5.6f);
        Complex c2 = new Complex(8.9f, 3.3f);

        Complex c3 = c1.plus(c2);

        c3.display();
    }
}
