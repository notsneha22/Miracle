# include <stdio.h>

int main() {

    int n,i;
    int fact = 1;

    printf("Enter a num:");
    scanf("%d", &n);

    for(int i = 0; i <n; i++) {
        fact = fact*i;

    }

    printf(fact);

    return 0;
}