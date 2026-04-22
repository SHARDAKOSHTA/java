import java.util.Arrays;
import java.util.Scanner;

public class lec4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// String str="ABA";
// String rev="";
// for(int i=str.length()-1;i>=0;i--){
// rev=rev+str.charAt(i);
// }
// System.out.println(rev);
// if(str.equals(rev)){
//     System.out.println("palindrome");
//     return;
// }
// else{
//     System.out.println("not palindrome");

// }


// String str1="silent";
// String str2="listen";
// char[] a=str1.toCharArray();
// char[] b=str2.toCharArray();
// Arrays.sort(a);
// Arrays.sort(b);
// if(Arrays.equals(a,b)){
//     System.out.println("anagram");
// }
// else{
//     System.out.println("not anagram");
// }



String[] arr={"name","world","helloo"};
String longest=arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i].length()>longest.length()){
        longest=arr[i];
    }
}
System.out.println(longest);
    }
}


