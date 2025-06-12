//         //return typ

// public class One{
//     static int display(){
//         return 10;
//     }
//     public static void main(String ar[]){
//      System.out.print(display());
//     }
// }


 // string type

// public class One{
//     static String display(){
//         return "vaishnavi";
//     }
//     public static void main(String ar[]){
//      System.out.print(display()+" " +"choudhary");
//     }
// }


// parametar with non return 

// public class One{
//     static void sum(int a,int b){
//      System.out.print(a+b);
//     }
//     public static void main(String ar[]){
//     sum(10,11);
//     }
// }


//parametar with return


// public class One{
//     static int sum(int a,int b){
//     return a+b;
//     }
//     public static void main(String ar[]){
//   System.out.print(  sum(10,11) );
//     }
// }


//array typ

// public class One{
//     static int sumOfArray(int arr[]){
        
//         for(int i:arr){
//             System.out.print(i);
//         }
//         return 0;
//     }
//     public static void main(String ar[]){
     
//      int arr[]={1,2,3,4,5};
//      sumOfArray(arr);
//     }
// }

//function


// public class One{
//     static int sumArray(int arr[]){
//         int sum=0;
//         for(int i=0;i<arr.length;++i){
//            sum=sum+arr[i];
//         }
//         return sum;
//     }
//     public static void main(String ar[]){
     
//      int num[]={1,2,3,4,5};
//      int total=sumArray(num);
//      System.out.println("sum of arrey" + total);
//     }
// }


// loop

// public class One{
//     static int primeNumber(int num){
      
//       for(int i=2;i<arr.length;++i){
//         if(num%i==0){
//            System.out.println("prime");
//            return 0;
//         }
//         System.out.println("not a prime");
//         return 0;
//       }
//     }
//     public static void main(String ar[]){
     
//      primeNumber(10);
// }
// }


// factorial

// public class One{
//     static int multiPly(int num){
      
//         if(num==1){
//            return 1;
//         }
//         return num*multiPly(num-1);
//       }
//     }
//     public static void main(String args[]){
     
//      System.out.println(primeNumber(10));
// }


// fabbonaci series
public class One{
    static int fiBo(int num){
      
        if(num==0){
           return 0;
        }
        else if(num==1){
            return 1;
        }
        return fiBo(num-1)+fiBo(num-2);
      }
    }
    public static void main(String args[]){

        int num=5;
        for(int i=0;i<5;++i)
     
     System.out.println(fiBo(i));
}

