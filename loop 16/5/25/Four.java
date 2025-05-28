
import java.util.Scanner;
public class Four{
    public static void main(String arr[]){

// calculaTOR


// int power=2;
// int base=4;
// int ans=1;

// for(int i=1;i<=power;i++){
//     ans=ans*base;
//     System.out.println(ans);
// }





//fabonacci series

// int i=1;
// int n=5;
// int first=1;
// int second=2;

// while(i<=n){
//     if(i==1){
//         System.out.println(i);
//         i++;
//         continue;
//     }
//     if(i==2){
//         System.out.println(i);
//         i++;
//         continue;
//     }
//     int next = first+second;
//     first=second;
//     second=next;
//     i++;
//     System.out.println(next);
    
//     }

//3 digit larger number



Scanner obj=new Scanner (System.in);
System.out.print("enter a 3 digit :");
int num=obj.nextInt();

int max=0;
while(num>0){
    int digit=num%10;
    if(digit>max){
        max=digit;
    }
    num=num/10;
}
System.out.println("larger :"+ max);
}
}