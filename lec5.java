import java.util.Scanner;

public class lec5 {
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        // String str="abc";
     
        // for(int i=0;i<str.length();i++){
        //     for(int j=i+1;j<=str.length();j++){
        //         System.out.println(str.substring(i,j));
           
        //     }
        // }
       
        // String str="abc";
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     for(int j=i;j<str.length();j++){
        //    if(str.charAt(i)== str.charAt(j))
        //    count++;
        //     }
        // }
        // System.out.println("count"+count);



// String str="a2f5g8";
// int max=-1;
// for(int i=0;i<str.length();i++){
//     char ch=str.charAt(i);
//     if(Character.isDigit(ch)){
//         int num=ch-'0';
//     if(max<num){
//         max=num;
//     }
// }
// }
// System.out.println(max);


// String str="apple";
// char remove='a';
// for(int i=0;i<str.length();i++){
//     if(str.charAt(i)==remove){
//     str=str.replace("a","");
//     }
// }
// System.out.println(str);

// String str="aabbccddee";
// String res="";
// res+=str.charAt(0);
// for(int i=1;i<str.length();i++){
   
//         if(str.charAt(i)!=str.charAt(i-1)){
//             res+=str.charAt(i);
//         }
//     }

// System.out.println(res);




//recursion

static void printnum(n){
    if(n>5){
        return;
    }
    System.out.println(n);
    printnum(n+1);

}
public static void main(String[] args){
    System.out.println(printnum(5));;

}

     }
    }