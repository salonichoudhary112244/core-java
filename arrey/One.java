import java.util.Scanner;
public class One{
    public static void main(String ar[]){
        // //valid way
        // int arr[]={1,2,3,4,5};
        // int arr2[]=new int{1,2,3,4,5,6};

        // //invalid way
        // // int arr[5]={1,2,3,4,5};
        // // int arr[1]=new int{1,2,3,4,5,6,7,8};

        // //declation

        // int arr3[];
        // int[] arr4;
        // int []arr5;

        // //invalid
        // //int arr[5];

        // //instance

        // int[] arr6=new int[20];
        //int[] arr=new int[];

       //dynamic initization
       
    //    Scanner obj=new Scanner(System.in);

    //    System.out.print("enter the size of arrey");
    //    int size=obj.nextInt();
    //    int arr[]=new int[size];
    //    System.out.print("enter the value of arrey");
    //    for(int i=0; i<arr.length;++i){
    //     arr[i]=obj.nextInt();
    //    }
    //    for(int arr1:arr){
    //     System.out.println(arr1);
    //    }





//user se input
    // Scanner obj=new Scanner(System.in);
    // System.out.print("enter the size of arrey");
    // int size=obj.nextInt();
    // int arr[]=new int[size];
    // System.out.print("enter the value of arrey");
    // for(int i=0;i<arr.length;++i){
    //     arr[i]=obj.nextInt();
    // }

    // //for each arrey
    // for(int arr1:arr){
    //     System.out.println(arr1);
    // }

    
//sum of arrey

    // Scanner obj=new Scanner(System.in);
    // System.out.print("enter the size of arrey");
    // int size=obj.nextInt();
    // int arr[]=new int[size];
    // System.out.print("enter the value of arrey");
    // for(int i=0;i<arr.length;++i){
    //     arr[i]=obj.nextInt();
    // }
    // for(int arr1:arr){
    //     System.out.println(arr1);
    // }
    // int sum=0;
    // for(int i=0;i<arr.length;++i){
    //     sum=sum+arr[i];
    // }
    // System.out.print(sum);



 Scanner obj=new Scanner(System.in);
    System.out.print("enter the size of arrey");
    int size=obj.nextInt();
    int arr[]=new int[size];
    System.out.print("enter the value of arrey");
   for(int i=0;i<arr.length;++i){
        arr[i]=obj.nextInt();
    }
    for(int i=0;i<arr.length/2;++i){
        int temp=arr[size-i-1];
        arr[size-i-1]=arr[i];
        arr[i]=temp;
    }
    for( int i:arr){
        System.out.print(i);
    }
    

    }
}