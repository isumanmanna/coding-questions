import java.util.Scanner;

public class Qu_162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.next().toUpperCase();
        String destination = scanner.next().toUpperCase();
        scanner.close();

        String[] busStops = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
        float[] path = { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };

        int sourceIndex = -1, destinationIndex = -1;
        float res = 0;

        // Find the indices of source and destination
        for (int i = 0; i < 8; i++) {
            if (source.equals(busStops[i])) {
                sourceIndex = i;
            }
            if (destination.equals(busStops[i])) {
                destinationIndex = i;
            }
        }

        // If source and destination are invalid or same
        if (sourceIndex == -1 || destinationIndex == -1 || sourceIndex == destinationIndex) {
            System.out.println("INVALID INPUT");
            return;
        }

        int i = (sourceIndex + 1) % 8;

        while (i != (destinationIndex + 1) % 8) {
            res += path[i];
            i = (i + 1) % 8; // Move circularly
        }

        // Calculate fare and print result
        System.out.println((int) Math.ceil(res * 0.005) + " INR");
    }
}
