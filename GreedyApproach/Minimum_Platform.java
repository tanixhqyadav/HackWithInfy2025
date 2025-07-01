import java.util.*;
public class Minimum_Platform{
    public static void main(String[] args) {
        int arr[] = {1000, 1010, 1020, 1030, 1040};
        int dep[] = {1010, 1020, 1030, 1040, 1050};
        int n = arr.length;
        System.out.println("Minimum platforms required: " + findPlatform(arr, dep, n));
    }
    // Function to find the minimum number of platforms required
    public static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platform_needed = 1, result = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platform_needed++;
                i++;
            } else if (arr[i] > dep[j]) {
                platform_needed--;
                j++;
            }
            result = Math.max(result, platform_needed);
        }
        return result;
    }
}