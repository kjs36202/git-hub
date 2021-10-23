import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner SC = new Scanner(System.in);
        System.out.println("무엇을 입력할까요? ");
        int ac = SC.nextInt();
        System.out.println(ac);
        SC.close();
    }
}
