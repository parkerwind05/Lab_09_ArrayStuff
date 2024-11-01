import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        float sum = 0;
        float avg = 0;
        int input = SafeInput.getRangedInt(in, "Enter your number", 1, 100);
        int match = 0;
        int index = -1;
        int min = 100;
        int max = 0;

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int num : dataPoints) {
            System.out.printf(num + " | ");
            if (num == input) {
                match++;
            }

        }


        System.out.println();
        for (int num : dataPoints) {
            sum += num;
        }
        avg = sum / (dataPoints.length);

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + avg);
        System.out.println("The value " + input + " was found " + match + " time(s) within the random array dataPoints.");
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == input) {
                index = i;
                break;
            }
        }
        if (index != -1)
            System.out.println("The value " + input + " was found at array dataPoint index " + index);
        else
            System.out.println(input + " was not found in the array dataPoint");

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == input) {
                index = i;
                break;
            }
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The min of the dataPoints array is: " + min);
        System.out.println("The max of the dataPoints array is: " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }


    public static double getAverage(int values[])
    {
        double sum = 0;
        double average = 0;
        for (double num : values)
        {
            sum += num;
        }
        average = sum / (values.length);

        return average;
    }

}