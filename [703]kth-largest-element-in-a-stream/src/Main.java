public class Main {

    public static void main(String[] args){
        int k = 1;
        int[] arr = {};
        KthLargest kthLargest = new KthLargest(3, arr);
        System.out.println(kthLargest.add(-3));// returns 4
        System.out.println(kthLargest.add(-2));// returns 5
        System.out.println(kthLargest.add(-4));// returns 5
        System.out.println(kthLargest.add(0));// returns 8
        System.out.println(kthLargest.add(4));// returns 8
    }
}
