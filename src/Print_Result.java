import java.util.Scanner;

public class Print_Result {
    public int print_scan(){
        System.out.print("숫자를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
}
