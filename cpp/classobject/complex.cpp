#include <iostream>

using namespace std;

class complex
{
private:
    float real;
    float imaginary;
public:
    complex() {}
    complex(float real, float imaginary);
    complex operator+(complex c);
    void display();
};

complex::complex(float real, float imaginary)
{
    this->real = real;
    this->imaginary = imaginary;
}

complex complex::operator+(complex c)
{
    complex sum;
    sum.real = real + c.real;
    sum.imaginary = imaginary + c.imaginary;
    return sum;
}

void complex::display()
{
    cout << real << " + " << imaginary << "i";
}

int main(void)
{
    complex c1(1.7f, 5.6f), c2(8.9f, 3.3f);

    complex c3 = c1 + c2;

    complex *c4 = new complex();   // dynamically creating object

    c3.display();

    return 0;
}