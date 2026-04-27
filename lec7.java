import java.util.Arrays;
import java.util.Scanner;

public class lec7 {
//     static int total=0;
    
//     static void getallsubset(int[] ar,int i,int sum){
//         if(i==ar.length){
//             total+=sum;
//             return;
//         }
//         getallsubset(ar,i+1,sum+ar[i]);
//             getallsubset(ar,i+1,sum);
        
//     }
//     public static void main(String[] args) {
//         int [] ar={1,2,3};
//         int i=0;
//         int sum=0;
//         getallsubset(ar,i,sum);
//         System.out.println(total);
//     }
// }
        



    
//     static void getallsubset(int[] ar,int i){
//         if(i==ar.length) return 0;
          
//        int x= ar[i]+getallsubset(ar,i+1);
//          int y=   getallsubset(ar,i+1);
//          return Math.max(x,y);
        
//     }
//     public static void main(String[] args) {
//         int [] ar={1,2,3};
//         int i=0;
//         System.out.println(getallsubset(ar,i));
//     }
// }
        


// static int fibo(int n,int[] dp){
//         if(n<=1) return n;
//         dp[n] =fibo(n-1,dp)+fibo(n-2,dp);
//         return dp[n];
//     }
//     public static void main(String[] args) {
//         int n=6;
//         int[] dp=new int[n+1];
//        Arrays.fill(dp, -1);
//         System.out.println(fibo(n,dp));
//     }
// }


//     static void count(int[] ar,int i,int sum,int k,int[] ans,int size){
//         if(i==ar.length){
//             if(sum==k){
//                 for(int j=0;j<size;j++){
//                     System.out.println(ans[j]+" ");
//                 }
//                 System.out.println();
//             }
//             return;
//         }
//        ans[size]=ar[i];
//        count(ar,i+1,sum+ar[i],k,ans,size+1);
//  count(ar,i+1,sum,k,ans,size+1);
//     }
//     public static void main(String[] args) {
//         int [] ar={1,2,1};
//         int i=0;
      
//         int k=2;
//         int sum=0;
//         int[] ans=new int[ar.length];
//         int size=0;
//       ;count(ar,i,sum,k,ans,size);
      
//     }

// }


 static int count(int[] ar,int i,int sum,int k){
        if(i==ar.length){
            if(sum==k){
               return 1;
            }
            return 0;
        }
      
     int x=  count(ar,i+1,sum+ar[i],k);
 int y=count(ar,i+1,sum,k);
 return x+y;
    }
    public static void main(String[] args) {
        int [] ar={1,2,1};
        int i=0;
        int k=2;
        int sum=0;
        // int[] ans=new int[ar.length];
      
      System.out.println(count(ar,i,sum,k));
      
    }
}
