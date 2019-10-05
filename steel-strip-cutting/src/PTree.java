import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 基于父节点表示法的树实现
 */
public class PTree<T> {

    private List<TNode<T>> tree;
    Set
    private int n;

    //创建空树
    public void clearTree(){
        tree = new ArrayList<TNode<T>>();
        n = 0;
    }

    //构造树
    public void createTree(){

    }

    //树是否为空
    public boolean isEmpty(){
        return 0 == n;
    }

    //树的深度
    public int treeDeepth(){
        int k, m, def, max = 0;
        for (int i = 0; i < tree.size(); i++) {
            def = 1;
            TNode<T> item = tree.get(i);
            while (item.parent != -1){
                item = tree.get(item.parent);
                def++;
            }
            if(max<def)max=def;
        }
        return max;
    }

    //获取根结点
    public  TNode<T> root(){
        for (int i = 0; i < tree.size(); i++) {
            if (tree.get(i).parent < 0)
                return tree.get(i);
        }
        return null;
    }

    //获取指定位置结点
    public  TNode<T> getNode(int i){
        if (i < n)
            return tree.get(i);
        return null;
    }


    //节点表示
    class TNode<T>{
        T node;
        int parent;
    }
}
