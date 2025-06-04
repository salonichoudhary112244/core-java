public class Two{
    public static void main(String ar[]){

        //palindrom


        // int arr[]={1,2,3,2,1,};
        // boolean palindrom=true;
        // int n=arr.length;

        // for(int i=0;i<n-1;++i){
        //     if(arr[i]!=arr[n-i-1]){
        //         palindrom=false;
        //         break;
        //     }
        // }
        // if(palindrom){
        //     System.out.print("palindrom");
        // }
        // else{
        //     System.out.print("not palindom");
        // }
        

//asemdring


// int arr[]={1,3,6,2,4,5};
// int n=arr.length;
// for(int i=0;i<n;++i){
//     for(int j=i+1;j<n;++j){
//         if(arr[i]>arr[j]){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//     }
//     System.out.print(arr[i]);
// }
        

//desending order

// int arr[]={1,3,6,2,4,5};
// int n=arr.length;
// for(int i=0;i<n;++i){
//     for(int j=i+1;j<n;++j){
//         if(arr[i]<arr[j]){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//     }
//     System.out.print(arr[i]);
//         System.out.print(" ");
// }


int arr[]={18,62,43,4,35};
int n=arr.length;

for(int i=0;i<n-1;++i){
    for(int j=i+1;j<n-1;++j){
        if(arr[i]>arr[j+1]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    System.out.print(arr[i]);
    System.out.print(" ");
}
    }
}