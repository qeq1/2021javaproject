package com.atguigu.data;

import java.util.Arrays;

/*
实现单链表
1.通过画图可知：
    单链表 采用 节点存储数据  一部分存储数据 一部分存储下一个节点的地址

2.定义内部类 构建节点
    两个属性：
           数据 data
           下一个节点的地址 next
3.定义一个头结点 用于 存储后来的数据
   //定义头节点
    private Node head;
4.定义一个变量 记录 节点的数据
    private int count;
 */
public class MySingleWayList<E> {

    //定义头节点
    private Node head;
    //定义变量 记录 元素的数量
    private int count;


    public void remove(E e) {
        //0.当链表没有数据时 不能进行删除操作
        if (head == null) {
            System.out.println("此链表没有数据 不能进行删除操作");
            return;
        }
        //1.当元素为null时
        if (e == null) {
            //1.1删除的是头节点
            if (head.data == null) {
                //找到头结点的下一个节点
                Node node = head.next;

                head.data = null;
                head.next = null;
                //将下一个节点变为头节点
                head = node;

                count--;
            } else {
                //1.2删除的不是头节点
                Node node = head;
                //定义变量 记录前一个节点
                Node preNode = null;
                while (node.data != null) {
                    //此时记录的是删除节点的前一个节点
                    preNode = node;
                    //切换到下一个数据不为null的节点
                    node = node.next;
                    //找到最后也没有找到
                    if (node == null) {
                        break;
                    }
                }
                //当 node 为null时  说明 当前的链表内 没有null数据的
                if (node != null) {
                    preNode.next = node.next;
                    //方便 垃圾回收器 快速的回收垃圾
                    node.next = null;
                    node.data = null;
                    count--;
                }
            }
        } else {
            //1.1删除的是头节点
            if (e.equals(head.data)) {
                //找到头结点的下一个节点
                Node node = head.next;

                head.data = null;
                head.next = null;
                //将下一个节点变为头节点
                head = node;
                count--;
            } else {
                //2.当元素不为null时
                //1.2删除的不是头节点
                Node node = head;
                //定义变量 记录前一个节点
                Node preNode = null;
                while (!e.equals(node.data)) {
                    //此时记录的是删除节点的前一个节点
                    preNode = node;
                    //切换到下一个数据不为null的节点
                    node = node.next;
                    //找到最后也没有找到
                    if (node == null) {
                        break;
                    }
                }
                //当 node 为null时  说明 当前的链表内 没有null数据的
                if (node != null) {
                    preNode.next = node.next;
                    //方便 垃圾回收器 快速的回收垃圾
                    node.next = null;
                    node.data = null;
                    count--;
                }
            }
        }


    }


    public void add(E e) {
        //0.将数据包装为一个节点
        Node newNode = new Node(e, null);
        //1.判断是不是空的链表
        if (head == null) {
            head = newNode;
        } else {
            //2.不是空的链表 在最后进行数据追加
            Node node = head;
            //寻找最后的节点
            while (node.next != null) {
                node = node.next;
            }
            //将新添加的节点 追加到最后
            node.next = newNode;
        }

//添加成功 数量 +1
        count++;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        //新建一个数组 存储数据
        Object[] obj = new Object[count];
        Node node = head;
        for (int i = 0; i < obj.length; i++) {
            //获取节点数据 并添加到数组内
            obj[i] = node.data;
            //切换到下一个节点   //遍历链表 拿到数据
            node = node.next;
        }
        //遍历数组返回结果  [10, 你好]
        return Arrays.toString(obj);

    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
