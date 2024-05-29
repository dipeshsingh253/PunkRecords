#include <stdio.h>


int main() {
  int num1, num2;
  printf("Enter two numbers: ");
  scanf("%d %d", &num1, &num2);

  // Addition
  int sum = num1 + num2;

  // Subtraction
  int difference = num1 - num2;

  // Multiplication
  int product = num1 * num2;

  // Division
  float quotient = (float)num1 / num2;

  // Print the results
  printf("Sum: %d\n", sum);
  printf("Difference: %d\n", difference);
  printf("Product: %d\n", product);
  printf("Quotient: %.2f\n", quotient);

  return 0;
}
