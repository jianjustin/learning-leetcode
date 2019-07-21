public class KthLargest {

    private int[] heap;
    private int size;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        if(nums.length == 0)
            heap = new int[16];
        else
            heap = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public int add(int val) {
        insert(val);
        int[] heap2 = new int[heap.length];
        for (int i = 0; i < size; i++)
            heap2[i] = heap[i];

        int result = 0 , size1 = size;
        for (int i = 0; i < k; i++)
            result = remove();

        heap = heap2;
        size = size1;
        return result;
    }



    public int insert(int item){
        if(isFull())
            resize() ;
        heap[size++] = item ;
        return fixUp();
    }

    public int remove(){
        int value = heap[0];
        if(size > 0)
            heap[0] = heap[--size] ; //将最后一个元素提到堆顶
        heap[size] = 0 ; //清空最后一个的数据
        fixDown(); //下沉操作
        return value;
    }

    /**
     * 下沉
     */
    private int fixDown() {
        int f = 0 , k  ;
        while((k = (f << 1) + 1) < size) { //至少存在左子节点
            if(k < size - 1)    //存在右子节点
                if (heap[k] < heap[k + 1])k++; //获取兄弟节点中较小节点

            if(heap[f] >= heap[k]) break; //退出循环
            int temp = heap[f] ;
            heap[f] = heap[k];
            heap[k] = temp ;
            f = k ;
        }
        return f;
    }

    /**
     * 上浮
     */
    private int fixUp() {
        int  j = size -1 ;   //最后一个元素的下标
        int f ; //父节点的下标
        while((f = ((j -1) >>1)) >= 0) { //通过父节点的下标
            if(heap[f] >= heap[j])break; //退出循环
            int temp = heap[f] ;
            heap[f] = heap[j];
            heap[j] = temp ;
            j = f ;
        }
        return f;
    }

    public void resize(){
        int[] a = new int[size << 1];
        for (int i = 0; i < size; i++)
            a[i] = heap[i];

        heap = a;

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == heap.length;
    }
}
