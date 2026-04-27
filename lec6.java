import java.util.Scanner;
public class lec6 {
// static void fibo(String s,int n){
//     if(n==0){
//         System.out.println(s);
//         return;
//     }
//     fibo(s+"0",n-1);
//     fibo(s+"1",n-1);
// }
// public static void main(String[] args) {
//     int n=2;
//     fibo("",n);
// }
// }


    static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibo(n));
    }
}
