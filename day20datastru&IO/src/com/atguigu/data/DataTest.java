package com.atguigu.data;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataTest {
    /*
    入栈和出栈 都是 对 栈顶元素而言
       FILO: first in  last out
     */
    @Test
    public void test01(){
        //模拟栈操作
        Stack<String> stack = new Stack<>();
        stack.push("你好");
        stack.push("世界");
        stack.push("是的");
        stack.push("李白");
        System.out.println(stack);

        String p1 = stack.peek();
        System.out.println(p1);

        //弹栈
        String pop = stack.pop();

        System.out.println("pop = " + pop);

        stack.pop();

        //获取栈顶元素
        String p2 = stack.peek();
        System.out.println("p2 = " + p2);

    }

    @Test
    public void test02(){
        /*
        队列操作：先进先出  FIFO fist in  first out

          add():入队

          remove()：会发生异常
          poll():  不会发生异常  出队操作



         */

        Queue<String> queue = new LinkedList<>();


        //入队
        queue.add("客人1");
        queue.add("客人2");
        queue.add("客人3");


        System.out.println(queue);
        //出队操作

       /* queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();*/

       queue.poll();
       queue.poll();
       queue.poll();
       queue.poll();
       queue.poll();
       queue.poll();

        System.out.println(queue);






    }


}
