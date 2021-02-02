package com.atguigu.data.list;

public interface List<E>  extends Iterable<E>{

    void add(E e);

    void remove(E e);

    void remove(int index);

    E indexOf(int index);

    int size();

    void clear();

    void set(int index, E e);

    int getIndex(E e);


}
