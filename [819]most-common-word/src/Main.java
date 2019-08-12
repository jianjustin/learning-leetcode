public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        String paragraph = "abc abc? abcd the jeff!";
        String[] banned = {"abc","abcd","jeff"};
        System.out.print(solution.mostCommonWord(paragraph,banned));
    }
}
