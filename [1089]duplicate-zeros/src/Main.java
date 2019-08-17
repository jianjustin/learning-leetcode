public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }
}
