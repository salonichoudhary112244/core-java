import java.util.Scanner;
public class Aarrey{
    public static void main(String ar[]){

        //user se input
        
    //    Scanner obj=new Scanner(System.in);

    //    System.out.print("enter a size -");
    //    int size=obj.nextInt();

    //    int arr[]=new int[size];
    //    System.out.print("enter a value -");

    //    for(int i=0;i<arr.length;++i){
    //     arr[i]=obj.nextInt();
    //    }
    //    for(int arr1:arr){
    //     System.out.print(arr1);
    //    }

//sum of arrey

// Scanner obj=new Scanner(System.in);

// System.out.print("enter a size = ");
// int size = obj.nextInt();

// int arr[]=new int[size];
// System.out.print("enter a value = ");

// for(int i=0;i<arr.length;++i){
//     arr[i]=obj.nextInt();
// }
// for(int arr1:arr){
//     System.out.print(arr1);
// }
// int sum =0;
// for(int i=0;i<arr.length;++i){
//     sum=sum+arr[i];
// }
// System.out.print(" = ");
// System.out.print(sum);


// reverse

Scanner obj=new Scanner(System.in);

System.out.print("enter a size = ");
int size =obj.nextInt();

int arr[]=new int[size];
System.out.print("enter a value = ");

for(int i=0;i<arr.length;++i){
    arr[i]=obj.nextInt();
}

for(int i=0;i<arr.length/2;++i){
    int temp=arr[size-i-1];
    arr[size-i-1]=arr[i];
    arr[i]=temp;
}
for(int arr1:arr){
System.out.print(arr1);
}
    }
}