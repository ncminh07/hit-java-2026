import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[] a = {1,2,3,54,6};
        for(int i = 0; i<5; i++){
            System.out.println(a[i]);
        }
        for(int value : a){
            System.out.print(a[value]);
        }
    }
}