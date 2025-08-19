import java.util.*;

public class day5 {
    static void findleaders(int arr[]){
        List<Integer> leaders=new ArrayList<>();
        int n=arr.length;
        int maxnum=arr[n-1];
        leaders.add(maxnum);
        for(int i=n-2;i>=0;i--){
            if(maxnum<=arr[i]){
                leaders.add(arr[i]);
                maxnum=arr[i];
            }
        }
        Collections.reverse(leaders);
        System.out.println(leaders);
    }
    public static void main(String ar[]){
        int arr[]={2,98,3,103,38,21};
        findleaders(arr);
    }
}
