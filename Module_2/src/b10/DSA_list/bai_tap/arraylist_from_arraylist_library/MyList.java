package b10.DSA_list.bai_tap.arraylist_from_arraylist_library;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements= new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(int index,  E element){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = element;
    }

    public E get (int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("index" + i + ",Size" + i);
        }
        return  (E) elements[i];
    }

    public void remove(int index, E element){

    }






}
