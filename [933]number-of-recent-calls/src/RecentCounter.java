import java.util.ArrayList;
import java.util.List;

public class RecentCounter {

    public List<Integer> queue;
    public int queue_top;

    public RecentCounter() {
        queue = new ArrayList<Integer>();
        queue_top = 0;
    }

    public int ping(int t) {
        //将请求添加到队列
        queue.add(t);
        queue_top++;

        return getBeginQueue(t);
    }

    public int getBeginQueue(int t){
        int begin = t - 3000 , result = 0 , begin_item = queue_top;

        boolean isEnd = false;
        while(!isEnd){
            begin_item /= 2;
            if(begin_item == 0 || (begin > queue.get(begin_item-1) && begin <= queue.get(begin_item))){
                result = queue_top - begin_item - 1;
                if(begin <= queue.get(begin_item))result++;
                break;
            }
            if(begin <= queue.get(begin_item))begin_item /=2;
            if(begin > queue.get(begin_item))begin_item +=  (queue_top-begin_item)/2;

        }

        return result;

    }
}
