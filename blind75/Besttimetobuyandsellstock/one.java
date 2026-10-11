package blind75.Besttimetobuyandsellstock;
import java.util.Arrays;
public class one {
    public static int maxProfit(int[]arr) {

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int price : arr) {

            if (price < minPrice) {
                 minPrice = price;

            

            }
            int profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 8, 11, 9};
        System.out.print(maxProfit(arr));

    }
    
}
