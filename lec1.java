// class hello{
//  public static void main(String[] args) {
//     System.out.println("sharda koshta");   
// }
// }


public class hello{
    public static void main(String[] args) {
        int arr[]=new int[5];
        
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
//         int min=arr[0];
//     //    for(int i=0;i<arr.length;i++){
//     //         System.out.println(arr[i]);
//     //     }
// for(int i=0;i<arr.length;i++){
//     if(arr[i]<min){
//         min=arr[i];
//     }
// }
//     System.out.println(min);

//     }
// }


//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//     if(arr[i]>max){
//         max=arr[i];
//     }
// }
//     System.out.println(max);
//     }
// }

int n=5;
int sum=0;
for(int i=0;i<arr.length;i++){
    sum+=arr[i];
}
int avg=sum/n;
System.out.println(sum);
System.err.println(avg);
}
}