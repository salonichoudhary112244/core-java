//    public class One{
//     public static void main (String arr[]){
       
       
// natural no

// int sum=0;

// for(int i=1;i<=10;++i){
//     sum=sum+i;
// }
// System.out.print(sum);
//   }}


//lcm

// int num1=12;
// int num2=16;

// int max=(num1>num2)?num1:num2;
// int i=max;
// while(true){
//     if(i%num1==0 && i%num2==0){
//         break;
//     }
//     i=i+max;
// }
// System.out.print(i);
//     }}


//hcf

// int num1=12;
// int num2=16;
// int hcf=1;

// for(int i=1;i<=num1 && i<=num2; i++){
//     if(num1%i==0 && num2%i==0){
//         hcf=i;
//     }
// }
// System.out.print(hcf);
//     }}

//lcm

// int num1=12;
// int num2=18;

// int max=(num1>num2)?num1:num2;
// int i=max;
// while(true){
//     if(i%num1==0 && i%num2==0){
//        break;
//     }
//     i=i+max;
// }
// System.out.print(i);
//     }}

//largest number

// int num=23457;
// int res=0;

// while(num>0){
//     int digit=num%10;
//     if(res<digit){
//         res=digit;
//         System.out.print(digit);
//     }
//     num=num/10;
// }
// System.out.print(res);
//     }}


//smallest number

// int num=1234534;
// int res=9;

// while(num>0){
//     int digit=num%10;
//     if(res>digit)
//         res=digit;
//         System.out.print(digit);
//         num=num/10;
// }
// System.out.print(res);
//     }}

//power base


// int power=2;
// int base=4;
// int ans=1;

// for(int i=1; i<=power;i++){
//     ans=ans*base;
//     System.out.print(ans);

// }
//     }}


// input lene ke liye


// import java.util.Scanner;
// public class One{
//     public static void main(String arr[]){
//         Scanner obj = new Scanner(System.in);
//         System.out.println("enter value");
//         int a;
//         a=obj.nextInt();
//         System.out.println(a);
//     }
// }


// import java.util.Scanner;
// public class One{
//     public static void main(String arr[]){
//    int c=7;
//    int d=3;

//         System.out.println (c&d);
//          System.out.println (c|d);
//         System.out.println (c^d);

//     }
// }


//switch case
import java.util.Scanner;
public class Switch{
   public static void main(String arr[]) {
 Scanner obj= new Scanner(System.in);
 System.out.print("enter your choice if you want to select a default car or choice of");
 String choice=obj.next();
 if(choice.equals("default")){

    int rental =1000;
    System.out.println("your rental is 1000 enter your trip distance");
    int distance=obj.nextInt();
    if(distance>500){
      int fair;
      int discount=1000;
      fair=1000+distance*10-discount;
      System.out.println(fair);
    }
    else {
      int fair;
      fair=1000+distance*10;
      System.out.println(fair);
    }
   }
   else{
      System.out.print("enter your choice from suzuki,tata,toyota");
      choice=obj.next();
      if(choice.equals("suzuki")){
         int rental=2000;
         System.out.println("your rental is 2000 enter your trip distance");
         int distance=obj.nextInt();
         if(distance>500){
            int fair;
            int discount=1000;
            fair=2000+distance*20-discount;
            System.out.println(fair);
         }
         else{
            int fair;
            fair=2000+distance*20;
            System.out.println(fair);
         }
      }
      else if(choice.equals("tata")){
         int rental=3000;
         System.out.println("your rental is 3000 enter your trip distance");
         int distance=obj.nextInt();
         if(distance>500) {
            int fair;
            int discount=1000;
            fair=3000+distance*30-discount;
            System.out.println(fair);
         }
         else{
            int fair;
            fair=3000+distance*30;
            System.out.println(fair);
         }
      }
      else if(choice.equals("toyota")){
         {
         int rental=4000;
         System.out.println("your rental is 4000 enter your trip distance");
         int distance=obj.nextInt();
         if(distance>500){
            int fair;
            int discount=1000;
            fair=4000+distance*40-discount;
            System.out.println(fair);
         }
         else{
            int fair;
            fair=4000+distance*40;
            System.out.println(fair);
         }
      }
      
   }
   else{
         System.out.print("not allowed");
      }
      }
 }
}

