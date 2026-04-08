import java.util.Scanner;

public class lec3 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        // int sum=0;
        // for(int i=0;i<3;i++){
        //   sum+=arr[i][i];
        // }
        // System.out.println(sum);


//             int[][]transpose={{1,2,3},{4,5,6},{7,8,9}};            
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;i++){
//                  transpose[j][i]=transpose[i][j];
//         }
//     }
//      for(int i=0;i<3;i++){
//             for(int j=0;j<3;i++){
//                  transpose[j][i]=transpose[i][j];
         
//         }
//     }
//     for(int i=0;i<3;i++){
//             for(int j=0;j<3;i++){
//                  transpose[j][i]=transpose[i][j];
         
//         }
//     }

// for(int i=0;i<3;i++){
//     for(int j=0;j<3;j++){
//        System.out.println(transpose[j][i]);
//     }
//     System.out.println();
// }

// String str1="hlo";
// System.out.println(str1);
// String str2=new String("world");
// System.out.println(str2);
// System.out.println(str1.length());
// System.out.println(str2.length());
// System.out.println(str1.charAt(2));
// System.out.println(str1.substring(0,2));
// System.out.println(str1.equals(str2));
// System.out.println(str1.toUpperCase());
// System.out.println(str2.toLowerCase());
// System.out.println(str1.contains("hello"));
// System.out.println(str2.replace('1','z'));
// String str3=str1.concat("google");
// System.out.println(str3);


String str="move";
String rev="";
for(int i=str.length()-1;i>=0;i--){
rev=rev+str.charAt(i);
} 
System.out.println(rev);
    }
}
 





        
        