#include <stdio.h>

int main() {
    int arr[5] = {10, 20, 30, 40, 50};
    int *p = arr;
    int largest = *p;
    int second = *p;

    for (int i = 1; i < 5; i++) {
        if (*(p + i) > largest) {
            second = largest;
            largest = *(p + i);
        }
    }

    printf("Second largest = %d", second);

    return 0;
}
