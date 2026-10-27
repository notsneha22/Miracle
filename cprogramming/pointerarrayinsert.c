#include <stdio.h>

int main() {
    int arr[5] = {10, 20, 30, 40};
    int *p = arr;
    int n = 4;
    int value = 25;
    int pos = 3;

    if (n >= 5 || pos < 1 || pos > n + 1) {
        printf("Invalid insertion");
        return 0;
    }

    for (int i = n; i >= pos; i--) {
        *(p + i) = *(p + i - 1);
    }

    *(p + pos - 1) = value;
    n++;

    for (int i = 0; i < n; i++) {
        printf("%d ", *(p + i));
    }

    return 0;
}
