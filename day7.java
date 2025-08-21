public class day7 {

    // Function to calculate trapped rainwater
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];  // update leftMax
                } else {
                    water += leftMax - height[left];  // water trapped
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];  // update rightMax
                } else {
                    water += rightMax - height[right];  // water trapped
                }
                right--;
            }
        }
        return water;
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[] height = {3, 0, 2, 0, 4};

        int result = trap(height);
        System.out.println("Total water trapped: " + result);
    }
}
