import java.util.Scanner;

public class lec2 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        int res=decimaltobinary(n);
       System.out.println(res);
    }
    
      public static int decimaltobinary(int n){
       int ans=0,pos=1;
      while(n>0){
    int rem=n%2;
    ans+=rem*pos;
    pos*=10;
    n=n/2;
}
return ans;
}
    }


        // int arr[]=new int[7];
        
        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;
        // arr[4]=5;
        // arr[5]=6;
        // arr[6]=7;

// int n=arr.length;
// int num=7;
// int count=0;
// for(int i=0;i<n;i++){
//     if(arr[i]==num){
//         count++;
//     }
// }
//  System.out.println(count);
//     }
// }


       // rotate arr by k step
// int n=arr.length;
//    int k=3;
//    k=k%n;
//         int st=0;
//         int end=n-1;
//         while(st<end){
//             int temp=arr[st];
//             arr[st]=arr[end];
//             arr[end]=temp;
//             st++;
//             end--;
//         }

// st=0;
//  end=k-1;
// while(st<end){
//     int temp=arr[st];
//     arr[st]=arr[end];
//     arr[end]=temp;
//     st++;
//     end--;
// }
//  st=k;
//  end=n-1;
//  while(st<end){
//     int temp=arr[st];
//     arr[st]=arr[end];
//     arr[end]=temp;
//     st++;
//     end--;
//  }
//  for(int i=0;i<n;i++){
//    System.out.println(arr[i]);
//  }
// }
// }


        //reverse an array
//         int n=arr.length-1;
//         int st=0;
//         int end=n;
//         while(st<end){
//             int temp=arr[st];
//             arr[st]=arr[end];
//             arr[end]=temp;
//             st++;
//             end--;
//         }
//         for(int i=0;i<=n;i++){
//     System.out.println("reverse arr : "+arr[i]);
// }



        //linear search
//         int tar=7;
//         int idx=-1;
//         for(int i=0;i<5;i++){
//             if(arr[i]==tar){
//                 idx=i;
//                 break;
//             }
//             else{
//                 idx=-1;
//             }

//         }
//         if(idx!=-1){
//             System.out.println("tar is present at idx:"+idx);
//         }
//         else{
//             System.out.println("tar is not present");
//         }

//     }
// }



