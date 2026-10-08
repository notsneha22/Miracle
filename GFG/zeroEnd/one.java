package GFG.zeroEnd;

import java.util.ArrayList;

public class one {
    public static void main(String[] args) {

        int[] arr = {0, 2, 6, 0, 9, 7};

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int num : arr) {

            if (num != 0) {
                result.add(num);
            } else {
                res.add(num);
            }
        }

        result.addAll(res);

        System.out.println(result);
    }
}
    

