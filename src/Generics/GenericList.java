package Generics;

public class GenericList<T extends Comparable> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void addItem(T item){
        items[count++] = item;
    }
    public T grtItem(int index){
        return items[index];
    }
}
