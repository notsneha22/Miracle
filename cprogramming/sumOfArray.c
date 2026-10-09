#include <stdio.h>

int main(){
    int arr = {2,7,8,9,6};
    int t = 0;
    int n = 5;

    for(int i =0; i < n; i++) {
        t = arr[i] + t;
    }
    printf("%d" , &t);
    return 0;
}