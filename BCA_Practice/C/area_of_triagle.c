#include <stdio.h>

int main(){

    //Formula for area of triangle : 1/2 * heigh * base
    int h, b;
    printf("Enter height:");
    scanf("%d",&h);
    printf("Enter base:"); 
    scanf("%d",&b);

    double area = 0.5 * h * b;

    printf("Area of the given triangle is: %f\n", area);

    return 0;
}