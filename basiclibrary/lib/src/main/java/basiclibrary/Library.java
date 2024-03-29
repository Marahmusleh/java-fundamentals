/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;



import java.util.*;

public class Library {


    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("------- First func --------------");
        roll(4);
        System.out.println("------- Second func --------------");
        int num[] = {1, 2, 5, 7, 2};
        System.out.println("Is the  the array contains duplicate values? The answer is:" + containsDuplicates(num));
        System.out.println("------- Third func --------------");
        int[] arr = {1, 2, 4, 3, 5};
        System.out.println("the average of all the values in the array is:" + getAverage(arr));
        System.out.println("------- Fourth func --------------");
        int[][] fourArr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println("The Lowest average array ");
        System.out.println(Arrays.toString(lowestAverage(fourArr)));
//        int[] Arr1 = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(insertShiftArray(Arr1, 5)));
        System.out.println("------ Fifth func -------------");
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println((getWeather(weeklyMonthTemperatures)));

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");

        int[][] arr = { {1, 2, 3}, {3, 5, 7}, {1, 7, 10} };
        System.out.println(sumOfMatrix(arr));
    }

    public static int[] roll(int n) {
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * ((6 - 1) + 1)) + 1;
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }



    public static boolean containsDuplicates(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i != j) {
                    if (num[i] == num[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;

    }

    public static int[] lowestAverage(int[][] arr) {
        double sum = 0;
        double avg = 0;
        double lowestAvg = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                avg = sum / arr[i].length;
                if (i == 0) {
                    lowestAvg = avg;
                }
            }
            if (avg < lowestAvg) {
                lowestAvg = avg;
                index = i;
            }
            sum = 0;
            avg = 0;
        }
        return arr[index];
    }

//    public static int[] insertShiftArray(int arr[], int val){
//        int NewArr[] = new int [arr.length+1];
//        int count = 0;
//        double NewVal = Math.ceil(arr.length / 2);
//        for(int i=0; i<arr.length; i++){
//            if(i == NewVal){
//                NewArr[i] = val;
//                count++;
//            }
//            NewArr[i + count] = arr[i];
//        }
//        return NewArr;
//    }


    public static String getWeather(int[][] arr) {
        HashSet<Integer> newArr = new HashSet<Integer>();
        int min = arr[0][0];
        int max = arr[0][0];
        String output ="";
        for(int[] array : arr){
            for(int number: array){
                if(number > max){
                    max = number;
                }
                if(number<min){
                    min = number;
                }
                newArr.add(number);
            }
        }
        System.out.println("HIGH:" + max);
        System.out.println("LOW:" + min);

        ArrayList<Integer> NotSeenTemp = new ArrayList<Integer>();
        for(int i = min+1; i <= max;i++){
          if(!newArr.contains(i)){
              NotSeenTemp.add(i);
          }
        }
        output += "Never saw temperature: "+ NotSeenTemp;
        return output;
    }

    public static String tally(List<String> list) {
        HashSet<String> votes = new HashSet<String>(list);
        int counter = 0;
        int voted = 0;
        String winner = "";
        for (String element : votes) {
            for (int i = 0; i < list.size(); i++)
                if (Objects.equals(list.get(i), element))
                    counter++;
            if (counter > voted) {
                voted = counter;
                winner = element;
            }
            counter = 0;
        }
        return winner;
    }
}


