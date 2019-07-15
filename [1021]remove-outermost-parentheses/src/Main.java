public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "(()())(())(()(()))";
        String s1 = solution.removeOuterParentheses(s);
        System.out.println(s1);
    }
}
