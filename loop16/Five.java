public class Five{
    public static void main(String arr[]){
       
        //pattern

    //right angle tringle

    // for(int r=1;r<=5;++r){
    //     for(int c=1;c<=5;++c){
    //         if(c<=r){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // } 



      //invert left

        // for(int r=1;r<=5;++r){
        //     for(int c=1;c<=5;++c){
        //         if(c>=r){
        //             System.out.print("*");
        //         }
        //         else{
        //              System.out.print(" ");
        //         }
        //     }
        //      System.out.println();
        // }


//left angle trangle

//   for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c>=6-r){
//                     System.out.print("*");
//                 }
//                 else{
//                      System.out.print(" ");
//                 }
//             }
//              System.out.println();
//         }


//inverted right

//  for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=6-r){
//                     System.out.print("*");
//                 }
//                 else{
//                      System.out.print(" ");
//                 }
//             }
//              System.out.println();
//         }



        //pramid

        // for(int r=1;r<=5;++r){
        //     for(int c=1;c<=9;++c){
        //         if(c>=6-r && c<=4+r){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //   for(int r=1;r<=5;++r){
        //     for(int c=1;c<=9;++c){
        //         if(c>=r && c<=10-r){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //dymond
 
        //   int a=0;
        // for(int r=1;r<=9;++r){

        //     a=(r<=5)?++a:--a;
        //     for(int c=1;c<=9;++c){
        //         if(c>=6-a && c<=4+a){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


//number print

    //    int a=0;
    //     for(int r=1;r<=5;++r){
    //         for(int c=1;c<=5;++c){
    //             if(c<=r){
    //                 System.out.print(++a);
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }



// number one se

//  int a=0;
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=r){
//                     System.out.print(c);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }



// one one two two number print


        //  int a=0;
        // for(int r=1;r<=5;++r){
        //     for(int c=1;c<=5;++c){
        //         if(c<=r){
        //             System.out.print(r);
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


// A print


    //   String a="A";
    //     for(int r=1;r<=5;++r){
    //         for(int c=1;c<=5;++c){
    //             if(c<=r){
    //                 System.out.print(a);
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }


// abcd line se print
//    char a='a';
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=r){
//                     System.out.print(a++);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }



//capital A print



//  char a='a';
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=r){
//                     System.out.print((char)(r+64));
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//small a print row me print

//  char a='a';
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=r){
//                     System.out.print((char)(r+96));
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }



// colum me a print
char a='a';
        for(int r=1;r<=5;++r){
            for(int c=1;c<=5;++c){
                if(c<=r){
                    System.out.print((char)(c+96));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}