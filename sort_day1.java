class sort_day1{
    void sortarr(int arr[]){
        int low=0,mid=0,high=arr.length-1;

        while(mid<high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;

                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                //arr[mid]==2 then swap
                //high--;

                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;

                high--;
            }
        }
    }
    public static void main(String ar[]){
        sort_day1 s=new sort_day1();
        int arr[]={2,1,0,0,2,2,1};
        s.sortarr(arr);

        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
