import java.util.Scanner;

public class hwork1 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        comparison(s1,s2);
    }
    public  static void comparison(String s1,String s2){
        String str1, str2;
        char symbolS1,symbolS2;
        int num = 0;
        if(s1.length() == s2.length()){
            str1 = s1.toLowerCase();
            str2 = s2.toLowerCase();
            for(int i = 0;i<s1.length();i++){
                symbolS1 = str1.charAt(i);
                for(int j = 0;j<s1.length();j++){
                    symbolS2 = str2.charAt(j);
                    if(symbolS1 == symbolS2) {
                        num++;
                    }
                }
            }
            if(s1.length() == num){
                System.out.println(s1 + " и " + s2 + " -> " + true);
            }
        }
        else{
            System.out.println(s1 + " и " + s2 + " -> " + false);
        }
    }
}
