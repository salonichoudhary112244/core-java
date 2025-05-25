public class One{
    public static void main (String arr[]){
       
       
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


int power=2;
int base=4;
int ans=1;

for(int i=1; i<=power;i++){
    ans=ans*base;
    System.out.print(ans);

}
    }}