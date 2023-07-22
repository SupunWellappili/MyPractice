import java.util.Scanner;
public class Example09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number :");
        int num = input.nextInt();

        int division = 1;

        for (int i = num; i > 0; i--) {
            System.out.print(i + "*");

            division = i * (i - 1);
        }

        System.out.print("\b\b\b=" + division);
    }
}
