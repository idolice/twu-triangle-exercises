import java.io.IOException;
import java.util.Scanner;

/**
 * Created by bingwang on 2/13/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        SigleAsteriskPrinter sigleAsteriskPrinter = new SigleAsteriskPrinter();
        TrianglePrinter trianglePrinter = new TrianglePrinter();
        HorizontalAsteriskPrinter horizontalAsteriskPrinter = new HorizontalAsteriskPrinter();
        VerticalAsteriskPrinter verticalAsteriskPrinter = new VerticalAsteriskPrinter();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.print("sigle asterisk\n");
        sigleAsteriskPrinter.print();
        System.out.print("horizontal asterisk\n");
        horizontalAsteriskPrinter.print(input);
        System.out.print("vertical asterisk\n");
        verticalAsteriskPrinter.print(input);
        System.out.print("triangle asterisk\n");
        trianglePrinter.print(input);
    }
}
