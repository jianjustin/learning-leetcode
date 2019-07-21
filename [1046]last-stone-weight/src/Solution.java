import java.util.Arrays;

public class Solution {

    public int lastStoneWeight(int[] stones) {
        MaxHeap maxHeap = new MaxHeap();
        for (int i = 0; i < stones.length; i++) {
            maxHeap.insert(stones[i]);
        }

        int result = 0;
        while (!maxHeap.isEmpty()){
            int m = maxHeap.remove();
            if(maxHeap.isEmpty()){
                result = m;
                break;
            }
            int n = maxHeap.remove();
            int k = m - n;
            if(0 == k)continue;
            maxHeap.insert(k);
        }
        return result;
    }

    class MaxHeap{
        int[] heap;
        private int size;

        public MaxHeap(){
            this(16);
        }

        public MaxHeap(int length){
            heap = new int[length];
            size = 0;
        }

        public int insert(int item){
            if(isFull())
                resize() ;
            heap[size++] = item ;
            return fixUp();
        }

        public int remove(){
            if(size <= 0) return -1;
            int value = heap[0];
            heap[0] = heap[--size] ; //将最后一个元素提到堆顶
            heap[size] = 0 ; //清空最后一个的数据
            fixDown(); //下沉操作
            return value;
        }

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

        public boolean isEmpty(){
            return size == 0;
        }

        public boolean isFull(){
            return size == heap.length;
        }

        public void resize(){
            int[] a = new int[size << 1];
            for (int i = 0; i < size; i++)
                a[i] = heap[i];

            heap = a;

        }

    }
}
