# include <stdio.h>

int main () {
    
    int arr [] = {2,2,3,4,5,4,2};
    int c = 0;
    int n = 7;
              
    for(int i = 0; i < n; i ++ ){
        for (int j = 0; j < n; j ++) {
            c = c + 1;
        }
        printf("%d\n" , c);
    }

    return 0;
}