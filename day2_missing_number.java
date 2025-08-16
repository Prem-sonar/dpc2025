public class day2_missing_number {
    void findmissing(int arr[]){
        int n=arr.length+1;
        int arrsum=n*(n+1)/2;
        int sum=0;
        for(int num:arr){
            sum=sum+num;
        }
        System.out.println("missing number:"+(arrsum-sum));
    }
    public static void main(String ar[])
    {
        day2_missing_number fm=new day2_missing_number();
        int arr[]={1,2,3,4,5,6};
        fm.findmissing(arr);
    }
}
