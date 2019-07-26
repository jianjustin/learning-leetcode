public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        int[] arr3 = solution.relativeSortArray(arr1,arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+"  ");
        }
    }
}
