public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        String[] strings = {"Hello", "Alaska", "Dad", "Peace"};
        String[] strings1 = solution.findWords(strings);
        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i]);
        }
    }
}
