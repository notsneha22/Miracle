package cprogramming;
import java.util.Arrays;
public class sumOfArray {
    public static void main(String[] args) {
        int[]arr = {2,7,8,9,6};
        int t = 0;

        for(int i = 0; i < arr.length; i++) {
            t = arr[i]+t;
        }
        System.out.print(t);

        
    }
    
}
