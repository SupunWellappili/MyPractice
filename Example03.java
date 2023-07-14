import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example03 {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int num1,num2;

        System.out.print("Inter Your Number : ");
        num1 = Integer.parseInt(bufferedReader.readLine());


    }
}
