import java.util.Scanner;

class Example08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();

        System.out.print("[");
        for (int i = num; i > 0; i--) {
            System.out.print(i+", ");
        }
        System.out.println(num<0 ? "Wrong Number]" : num==0?"Empty]" : "\b\b]");
    }
}