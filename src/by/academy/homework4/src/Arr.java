package by.academy.homework4;
public class Arr<T> {
    public static final int ARR_SIZE_DEFAULT = 16;

    private T[] arr;
   // private T obj;
    private int place = 0;

    Arr(){
        arr = (T[])(new Object[ARR_SIZE_DEFAULT]);
    }

    Arr(int size){
        arr = (T[]) (new Object[size]);
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    //Методы
/*1) добавления в наш массив объекта типа T - add(T obj)
(нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)*/
    public void add(T obj){
        if (place >= arr.length) {
            increase();
        }
        arr[place++] = obj;
    }

    public void increase(){
        T[] arrs = (T[]) new Object[2 * arr.length + 1];
        System.arraycopy(arr, 0, arrs, 0, arr.length);
        arr = arrs;
    }
//2) взятие по индексу get(int i)

    public T get(int index){
        return (T) arr[index];
    }
    //3) взятие последнего элемента getLast()

    public T getLast(){
        return  (T) arr[arr.length - 1];
    }

  //4) взятие первого элемента getFirst()
    public T getFirst(){
        return  (T) arr[0];
    }

    //5) вывод размера массива
    public  int sizeArr(){
       return place;
    }

    //6) вывод индекса последнего заполненого элемента (не путать с размерностью) -?
    public int indexLast(){
        return place - 1;
    }

    //7) удаление элемента по индексу (remove(int i)
    public void remove(int i){
        if (i >= place || i < 0) {
            System.out.println("Attempt to delete an empty element");
            return;
        }
        if (i < place) {
            System.arraycopy(arr, i + 1, arr, i, place - i - 1);
        }
        arr[--place] = null;
    }

    //8) удаление элемента по значению (remove(T obj))
     public  void  removeElement(T obj) {
        for(int i = 0; i < place - 1; i++){
            if(arr[i].equals(obj)){
                if(i< place){
                    System.arraycopy(arr, i + 1, arr, i, place - i - 1);
                }
                arr[--place] = null;
            }
        }
     }



}