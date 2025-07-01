import java.util.*;
public class ActivitySelection_problem{
    public static void main(String args[]){
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        int maxActivities = activitySelection(start, finish);
        System.out.println("Maximum number of activities: " + maxActivities);
    }
    public  static int activitySelection(int[] start, int[] finish) {
        int n=start.length;

        int[][] activities=new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        Arrays.sort(activities, (a, b) -> a[1]-b[1]);
        for (int i = 0; i < n; i++) {
            System.out.println(activities[i][0]+" "+activities[i][1]); 
        }
        int count = 1;  
        int lastFinish = activities[0][1];
        for (int i = 1; i < n; i++) {
            if (activities[i][0] > lastFinish) {
                count++;
                lastFinish = activities[i][1];
            }
        }

        return count;
    }
}