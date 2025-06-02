
    int arr[]=new int[size];
    System.out.print("enter the value of arrey");
    for(int i=0;i<arr.length;++i){
        arr[i]=obj.nextInt();
    }
    for(int arr1:arr){
        System.out.println(arr1);
    }
    for(int i=0;i<arr.length;++i){
        sum=sum+arr[i];