
import java.util.Scanner;

public class AylanaYuzi {
    public static void main(String[] args) {
        double r, s;
        Scanner input = new Scanner(System.in);

        System.out.print("Aylananing radiusini kiriting: ");
        r = input.nextDouble();

        s = Math.PI * r * r;

        System.out.println("Aylananing yuzi: " + s);
    }
}
