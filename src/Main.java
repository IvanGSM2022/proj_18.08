import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int age = Integer.parseInt(string);
        For_human_one.human(age);
        String s = For_human_one.human(age);
        System.out.println(s);
    }
}