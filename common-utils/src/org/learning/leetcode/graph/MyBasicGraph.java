package org.learning.leetcode.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 图实现
 *
 */
public class MyBasicGraph {

    public List<Vertex> vertexList;//节点列表
    public Map<String,Integer> vertexItemMap;//节点下标，用于快速寻找节点
    public List<List<Integer>> edges;//边存储
    public int edgesNum;//边的数量
    final static int defaultSize = 16;


    /*创建空图*/
    public MyBasicGraph(){
        this(defaultSize);
    }

    /*创建指定节点数的图*/
    public MyBasicGraph(int vertexListNum){
        vertexList = new ArrayList<Vertex>(vertexListNum);
        edges = new ArrayList<List<Integer>>(vertexListNum);
        edgesNum = 0;
    }

    /*节点插入*/
    public Vertex insertVertex(Vertex vertex){
        vertexList.add(vertex);
        vertexItemMap.put(vertex.getValue(),vertexList.size()-1);//标记节点位置

        /*初始化空边*/
        initEdge(vertexList.size()-1);
        return vertex;
    }

    /*插入边*/
    public void insertEdge(Vertex from,Vertex to,int value){
        int from_item = vertexItemMap.get(from.getValue());
        int to_item = vertexItemMap.get(to.getValue());
        edges.get(from_item).set(to_item,value);
        edgesNum++;
    }

    /*节点移除*/
    public Vertex removeVertex(Vertex vertex){
        vertexList.remove(vertex);
        int item_key = vertexItemMap.get(vertex.getValue());

        /*删除和节点相关的边*/
        edges.remove(vertex);//删除入度
        for (int i = 0; i < edges.size(); i++)
            edges.get(i).set(item_key,0);
        return vertex;
    }

    /*删除边*/
    public void removeEdge(Vertex from,Vertex to){
        int from_item = vertexItemMap.get(from.getValue());
        int to_item = vertexItemMap.get(to.getValue());
        edges.get(from_item).set(to_item,0);
        edgesNum--;
    }

    /*初始化节点边*/
    public void initEdge(int edge_item){
        List<Integer> list = new ArrayList<Integer>(edge_item);
        for (int i = 0; i < vertexList.size(); i++)
            list.set(i,0);
        edges.set(edge_item,list);
    }

    /*深度优先搜索*/
    public void DFSTraverse(){

    }

    /*广度深度搜索*/
    public void BFSTraverse(){}



    /*图顶点*/
    class Vertex{
        String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
