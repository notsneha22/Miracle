package GFG.rotateArray;
import java.util.Arrays;
public class one {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int d = 2;
        int n = arr.length;

        d = d % n;

        int[]temp = new int [n];

        for( int i : arr) {
            temp[i]= arr[(i+d) % n];

        }
        System.out.println(Arrays.toString(temp));
    }
    
}
