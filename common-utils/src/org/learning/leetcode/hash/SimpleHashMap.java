package org.learning.leetcode.hash;

import java.util.HashMap;

/**
 * 简易散列表
 */
public class SimpleHashMap<K,V> {

    Node<K,V>[] map;
    int size;
    int isFull;

    public SimpleHashMap(){
        this(16);
    }

    public SimpleHashMap(int size){
        map = (Node<K,V>[])new Node[size];
        this.size = size;
    }

    public V put(K key,V value){
        int hash = hashCode(key,size);
        Node<K,V> node = new Node<K, V>(hash,key,value,null);

        Node<K,V> front = map[hash];
        if(null == front) {
            front = node;
            isFull++;
        }else{
            while (null != front.next)
                front = front.next;
            front.next = node;
        }

        /*扩容条件*/
        if(isFull == size)resize();

        return value;
    }

    public Node<K,V> get(K key){
        int hash = hashCode(key,size);
        Node<K,V> front = map[hash];
        if(null == front)return null;
        while (front.key != key)
            front = front.next;
        return front;
    }

    public V getValue(K key){
        int hash = hashCode(key,size);
        Node<K,V> front = map[hash];
        if(null == front)return null;
        while (front.key != key)
            front = front.next;
        return front.getValue();
    }

    public Node<K,V> remove(K key){
        int hash = hashCode(key,size);
        Node<K,V> front = map[hash];
        if(null == front)return null;
        while (front.next.key != key)
            front = front.next;
        Node<K,V> result = front.next;
        front.next = front.next.next;
        return result;
    }

    public void resize(){
        int newSize = size*2;
        Node<K,V>[] newMap = (Node<K,V>[])new Node[newSize];

        for (int i = 0; i < size; i++) {
            Node<K,V> item = map[i];
            while (null != item){
                int hash = hashCode(map[i].getKey(),size);
                Node<K,V> node = new Node<K, V>(hash,map[i].getKey(),map[i].getValue(),null);

                Node<K,V> front = newMap[hash];
                if(null == front) {
                    front = node;
                    isFull++;
                }else{
                    while (null != front.next)
                        front = front.next;
                    front.next = node;
                }
                item = item.next;
            }
        }
    }

    public int hashCode(K key,int size){
        int hashCode = key.hashCode();
        return hashCode%size;
    }


    protected static class Node<K,V>{
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        public Node( K key, V value, Node<K,V> next) {
            this(key.hashCode(),key,value,next);
        }


        public Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
        public int gethash(){
            return hash;
        }
        public Node<K,V> getNext(){
            return next;
        }
        public Node<K,V> setNext(Node<K,V> node){
            this.next = node;
            return node;
        }
        public void setValue(V value){
            this.value = value;
        }
    }
}
