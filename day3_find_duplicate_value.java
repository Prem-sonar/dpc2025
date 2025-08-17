// public class day3_find_duplicate_value{
//     public int findDuplicate(int[] nums) {
//         int low = 1, high = nums.length - 1;  // values range from 1 to n
//         int duplicate = -1;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             // Count how many numbers are <= mid
//             int count = 0;
//             for (int num : nums) {
//                 if (num <= mid) {
//                     count++;
//                 }
//             }

//             // If count > mid, duplicate is in [low, mid]
//             if (count > mid) {
//                 duplicate = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }

//         return duplicate;
//     }

//     public static void main(String[] args) {
//         day3_find_duplicate_value obj = new day3_find_duplicate_value();
//         int[] arr = {1, 3, 4, 2, 2};
//         System.out.println("Duplicate number is: " + obj.findDuplicate(arr));
//     }
// }
class day3_find_duplicate_value{
    int find_duplicate(int arr[]){
        int slow=arr[0];
        int fast=arr[0];

        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);

        fast=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
    public static void main(String ar[]){
        day3_find_duplicate_value fdv=new day3_find_duplicate_value();
        int arr[]={2,1,3,4,2};
        System.out.println(fdv.find_duplicate(arr));
    }
}
