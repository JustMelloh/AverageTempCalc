import java.util.Scanner;

public class AverageTempCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of Days: ");
        int days = input.nextInt();

        double[] temps = new double[days];

        double sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.println("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = input.nextDouble();
            sum += temps[i];
        }

        double average = sum / days;

        int count = 0;
        for (double temp : temps) {
            if (temp > average) {
                count++;
            }
        }

        System.out.println("Average temperature: " + average);
        System.out.println("Number of days above average: " + count);
        input.close();
    }
}
