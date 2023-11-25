import java.util.Scanner;

public class SumAverage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double average;

        for (int i = 1; i <= 5; i++)
        {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }

        average = sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
