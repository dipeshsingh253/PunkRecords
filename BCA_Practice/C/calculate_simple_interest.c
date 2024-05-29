#include <stdio.h>

int main(int argc, char const *argv[])
{
    // Simple Interest = ( Principal Amount * Rate of Interest * Number of Years ) / 100
    int p, n;
    double r;
    printf("Enter P: ");
    scanf("%d", &p);
    printf("Enter R: "); 
    scanf("%lf", &r); // Corrected to use %lf for double
    printf("Enter N: "); 
    scanf("%d", &n);

    double interest = (p * r * n) / 100;

    printf("The interest amount is: %.2lf\n", interest);
    return 0;
}


// int %d 
// char %c 
// float %f 
// double %lf 
// pointer %p
// string %s