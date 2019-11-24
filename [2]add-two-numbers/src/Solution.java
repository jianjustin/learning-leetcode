public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode m = l1 , n = l2 , k = result;
        int x = 0 , y = 0 , item = 0;

        do{
            x = null == m ? 0 : m.val;
            y = null == n ? 0 : n.val;
            k.val = x + y + item--;
            if ((item=k.val/10) > 0)k.val%=10;
            if (null != m)m = m.next;
            if (null != n)n = n.next;
            if (null != m || n != null || item > 0)k.next = new ListNode(0);
            k = k.next;
        }while(null != m || n != null || item > 0);
        return result;
    }

    static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1,l2);
        while (null != result) {
            System.out.println(result.val);
            result = result.next;
        }


    }
}