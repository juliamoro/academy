package by.academy.homework4;
import java.util.Iterator;

public class CastIterator<T> implements Iterator<T> {
    private T[] arr;
    private int current;

    CastIterator(){
        super();
    }

    CastIterator(T[] arr){
        this.arr=arr;
    }

    @Override
    public boolean hasNext() {
        if (arr == null || arr.length <= current) {
            return false;
        }
        return true;
    }

    @Override
    public T next() {
        return arr[current++];
    }
}
