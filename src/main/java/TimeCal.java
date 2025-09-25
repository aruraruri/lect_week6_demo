import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km: ");
        int distance = sc.nextInt();
        System.out.println("Enter speed in km/h: ");
        int speed = sc.nextInt();
        double time = calculateTime(distance, speed);
        System.out.printf("Time taken to cover %d km at %d km/h is %.2f hours.%n", distance, speed, time);
    }

    public static double calculateTime(int x, int v) {
        return x / v;
    }
}
