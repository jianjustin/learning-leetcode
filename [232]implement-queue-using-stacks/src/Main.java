public class Main {

    public static void main(String[] args){
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);

        System.out.println(queue.pop());   // 返回 1
        System.out.println(queue.peek());  // 返回 1
        System.out.println(queue.empty()); // 返回 false
    }
}
