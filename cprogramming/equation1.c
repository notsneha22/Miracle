#include <stdio.h>

int main() {
    float x, a, term, sum = 0;
    int i, j;

    printf("Enter the value of x: ");
    scanf("%f", &x);

    a = (x - 1) / x;
    term = a;

    for (i = 1; i <= 9; i++) {
        if (i == 1) {
            sum = sum + term;
        } else {
            term = term * a;
            sum = sum + term / 2;
        }
    }

    printf("Sum of first 9 terms = %f\n", sum);

    return 0;
}
