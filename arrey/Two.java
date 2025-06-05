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

//assendig booble sort
// int arr[]={8,7,6,5,4};
// int n=arr.length;

// for(int i=0;i<n-1;++i){
//     for(int j=0;j<n-1;++j){
//         if(arr[j]>arr[j+1]){
//             int temp=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//         }
//     }
// }
// for( int a:arr)
//     System.out.print(a);
//     System.out.print(" ");

//     }
// }



// asending

// int arr[]={1,4,6,3,8};
// int size=arr.length;
// for(int i=0;i<size-1;++i){
//     for(int j=i+1;j<size;++j){
//         if(arr[i]>arr[j]){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//     }
// }
// for(int a:arr){
//     System.out.print(a);
// }


//desending


// int arr[]={1,4,6,3,8};
// int size=arr.length;
// for(int i=0;i<size-1;++i){
//     for(int j=i+1;j<size;++j){
//         if(arr[i]<arr[j]){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//     }
// }
// for(int a:arr){
//     System.out.print(a);
// }


//smallest 



// int arr[]={1,4,6,3,8};
// int size=arr.length;
// for(int i=0;i<size-1;++i){
//     for(int j=i+1;j<size;++j){
//         if(arr[i]>arr[j]){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//     }
// }
// for(int i=0;i<1;++i){
//     System.out.print(arr[i]);
// }



//gratest 


int arr[]={1,4,6,3,8};
int size=arr.length;
for(int i=0;i<size-1;++i){
    for(int j=i+1;j<size;++j){
        if(arr[i]<arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
for(int i=0;i<1;++i){
    System.out.print(arr[i]);
}

    }
    }