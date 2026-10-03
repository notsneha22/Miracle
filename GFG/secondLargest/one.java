package GFG.secondLargest;

public class one {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        int largest = arr[0];
        int sec_largest = arr[0];
        for(int num : arr){
            if (num > largest) {
                sec_largest = largest;
                largest = num;
            } else if (num > sec_largest && num != largest) {
                sec_largest = num;
            }

        }
        System.out.println("Second largest:" + sec_largest);

    }
    
}
