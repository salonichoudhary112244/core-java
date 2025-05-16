public class One{
    public static void main(String arr[]){
       
    //    int a=1;

    //    do{
    //      System.out.println(2*a);
    //      a++;
    //    }
    //    while(a<=10);
        
        
        // while loop


        // int a=1;
        // while(a<=10){
        //     System.out.println(2*a);
        // a++;

        // }


        // for(int i=1;i<=10;i++){
        //     System.out.println(2*a);
        // }

// int sum=0;

// for(int i=1;i<=10;++i){
//     sum=sum+i;
// }
// System.out.println(sum);


//   }
// }



// factorial

// int sum=1;

// for(int i=1;i<=10;++i){
//     sum=sum*i;
// }
// System.out.println(sum);


// 


// factor

// int num=6;

// for(int i=1;i<=6;++i){
//     if(num%i==0){
//         System.out.println(i);
//     }
// }



    // hcf

//   int num1=12;
//   int num2=16;
//   int hcf=1;
//   for(int i=1;i<=num1 && i<=num2;i++){
//     if(num1%i==0 && num2%i==0){
//       hcf=i;
//     }
//   }
//       System.out.println(hcf);


// lcm

 int num1=12;
  int num2=16;

  int mx=(num1>num2)?num1:num2;
  int i=mx;
  while(true){
    if(i%num1==0 && i%num2==0){
        break;
    }
    i=i+mx;
  }
System.out.print(i);
    }}
