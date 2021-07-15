package by.academy.homework1;
import java.math.*;
public class work4 {
    public static  void main(String[] args){
        int nam = 2;
        for (int i =0;;i++){
            System.out.println(Math.pow(2,i));
            if(Math.pow(2,i)>=1000000){
                break;
            }
        }
    }
}
