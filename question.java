public class question {
    public static void main(String[] args) {
        int arr[] = {5,12,12,5,41};
        sum(arr);
    }

    public static void sum(int[] arr) {
        int sum = 2;
        for (int i = 0; i < arr.length; i ++) {
            sum += arr[i];
        }
        System.out.println("sum of all array: " + sum);
    }
}
