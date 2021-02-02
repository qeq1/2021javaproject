package com.atguigu.data.list;

import java.util.Arrays;
import java.util.Iterator;

/*
自定义集合类
 */
public class MyArrayList<E> implements List<E> {
    //存储集合元素的数组
    private Object[] arr;
    //集合中元素的数量
    private int size;

    public MyArrayList() {
        arr = new Object[5];
    }

    public MyArrayList(int capcity) {
        arr = new Object[capcity];
    }

    @Override
    public void add(E e) {
        //校验是否扩容
        if (size >= arr.length) {
        /*
            //1.创建一个新数组
            Object[] newArr = new Object[arr.length*2];
            //2.将原有的数据 赋值到新数组内
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            //3.将新数组的地址 给旧数组
            arr = newArr;
            */
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        //数据添加到集合内 size数量+1
        arr[size++] = e;
    }

    @Override
    public void remove(E e) {

        int index = getIndex(e);
        if (index == -1) {
            throw new UnsupportedOperationException("没有此元素 不能删除 " + e);
        }

        remove(index);
    }

    @Override
    public void remove(int index) {
        //校验完毕
        checkIndex(index);
        /*
          删除 index = 1;位置的元素
          0   1    2  3   4
          10  20  30  40  50  size = 5
         */
        //完成数组元素的移动
        if(size-index-1>0){

            System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        }
        //清除最后一个元素
        //数量-1
       /* size--;
        arr[size] = null;*/

        //清除最后一个元素  数量-1
        arr[--size] = null;
    }

    /**
     * 校验数组是否越界的方法
     *
     * @param index
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标越界啦：" + index);
        }
    }

    @Override
    public E indexOf(int index) {
        //对下标进行校验
        checkIndex(index);
        return (E) arr[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
/*
        for (int i = 0; i <size; i++) {
            remove(i);
        }*/

        Object[] newArr = new Object[5];
        arr = newArr;

    }

    @Override
    public void set(int index, E e) {

        checkIndex(index);
        //将指定位置的数据进行更新
        arr[index] = e;
    }

    @Override
    public int getIndex(E e) {
        //如果是null值 采用 ==比较
        if (e == null) {
            //遍历集合 找指定元素
            for (int i = 0; i < size; i++) {
                //找到了 返回下标
                if (e == arr[i]) {
                    return i;
                }
            }

        } else {
            //否则采用equals()比较
            //遍历集合 找指定元素
            for (int i = 0; i < size; i++) {

                //找到了 返回下标
                if (e.equals(arr[i])) {

                    return i;

                }
            }
        }
        //没有找到 返回-1

        return -1;
    }

    @Override
    public String toString() {
        //[10, 90]
        StringBuffer sbf = new StringBuffer("[");

        for (int i = 0; i < size; i++) {
            if (i < size - 1) {//前面的元素
                sbf.append(arr[i] + ",");
            } else {//最后一个元素
                sbf.append(arr[i] + "]");
            }
        }

        return sbf.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {

        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }
        @Override
        public E next() {
            return (E) arr[cursor++];
        }
    }
}
