package com.atguigu.map;

import java.util.Arrays;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {


        Link1 list = new Link1();
        list.add(9);
        list.add(10);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        list.reverse();

        System.out.println(list);

        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

class Node<T> {
    Node next;
    Object data;

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
    public Node(Object data) {
        this.data = data;
    }
}

class Link1<T> {
    Node head;
    Node last;
    int size;

    public void add(T data) {
        Node newNode = new Node(data);
        if (last == null) {
            head = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public T next() {

            Node temp = head;
            for (int i = 0; i < cursor; i++) {
                temp = temp.next;
            }
            cursor += 1;
            return (T) temp.data;
        }
    }

    public void reverse() {
        Node[] n = new Node[size];
        Node temp = head;
        for (int i = 0; i < size; i++) {
            n[i] = temp;
            temp = temp.next;
        }
        System.out.println(Arrays.toString(n));

        Node temp1 = head;

        for (int i = size - 1; i >= 0; i--) {

            temp1.data = n[i].data;

            temp1 = temp1.next;
            System.out.println(temp1);
        }


    }
}
