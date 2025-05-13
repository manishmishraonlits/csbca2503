#include <iostream>

using namespace std;

class complex
{
private:
    float real;
    float imaginary;
public:
    complex(float real, float imaginary);
    complex plus(complex c);
};

complex::complex(float real, float imaginary)
{
    real = real;
    imaginary = imaginary;
}

complex complex::plus(complex c)
{
}

int main(void)
{
    complex c1(1.7f, 5.6f), c2(8.9f, 3.3f), c3;
}