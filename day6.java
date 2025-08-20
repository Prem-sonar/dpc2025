class day6{
    void sumzero(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=arr[j];
            if(sum==0){
                System.out.print("["+i+" "+j+"]");
            }
        }
        System.out.println(" ");
        }
    }
    public static void main(String ar[]){
        day6 d6=new day6();
        int arr[]={-1,1,-2,1,1};
        d6.sumzero(arr);
    }
}
