#include<stdio.h>
int main()
{
    char operator;
    float num1, num2, result;
    printf("simple calculator using c\n");
    printf("                 \n");
    printf("enter the first number\n");
    scanf("%f",&num1);
    printf("enter the second number\n");
    scanf("%f",&num2);

    printf("enter the operator [+,-,*,/]\n");
    scanf("%s",&operator);
    switch(operator)
    {
        case'+': result = num1 + num2;  // add two numbers
        break;
        case'-': result = num1 - num2;  // subtract two numbers
        break;
        case'*': result = num1 * num2;  // multiply two numbers
        break;
        case'/': result = num1 / num2;  // divide two numbers
        break;
        default: printf(" error in operation");
        break;

    }
    printf("\n %5.2f %c %5.2f = %5.2f\n", num1, operator, num2, result);
}
