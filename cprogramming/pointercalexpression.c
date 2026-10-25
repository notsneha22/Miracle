/* implement calculator performance using all arithmatic opr using p*.*/

#include <stdio.h>

int main() {

    int a,b;
    int *p1,*p2;

    *p1 = &a;
    *p2 = &b;

    prinf("Enter a and b:");
    scanf("%d %d" , &a,&b);

    printf("Addition = %d\n", *p1 + *p2);
    printf("Subtraction = %d\n", *p1 - *p2);
    printf("Multiplication = %d\n", *p1 * *p2);

    if (*p2 != 0) {
        printf("Division = %d\n", *p1 / *p2);
        printf("Modulus = %d\n", *p1 % *p2);
    } else {
        printf("Division and modulus by zero are not allowed.\n");


    }
    return 0;
}