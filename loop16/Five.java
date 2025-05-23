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
 
          int a=0;
        for(int r=1;r<=9;++r){

            a=(r<=5)?++a:--a;
            for(int c=1;c<=9;++c){
                if(c>=6-a && c<=4+a){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}