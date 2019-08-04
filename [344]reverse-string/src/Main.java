public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        //char[] chars = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        char[] chars = {'h','e','l','l','o'};
        solution.reverseString(chars);

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+"    ");
        }
    }
}
