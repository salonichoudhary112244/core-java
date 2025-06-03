public class Two{
    public static void main(String ar[]){
        int arr[]={1,2,3,2,1,};
        boolean palindrom=true;
        int n=arr.length;

        for(int i=0;i<n-1;++i){
            if(arr[i]!=arr[n-i-1]){
                palindrom=false;
                break;
            }
        }
        if(palindrom){
            System.out.print("palindrom");
        }
        else{
            System.out.print("not palindom");
        }
    }
}