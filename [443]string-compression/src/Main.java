public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(solution.compress(chars));

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+"  ");
        }

    }
}
