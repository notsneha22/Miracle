#include <stdio.h>

int main() {
    int arr[5] = {10, 50, 30, 20, 40};
    int *p = arr;
    int largest = *p;

    for (int i = 1; i < 5; i++) {
        if (*(p + i) > largest) {
            largest = *(p + i);
        }
    }

    printf("Largest = %d", largest);

    return 0;
}
