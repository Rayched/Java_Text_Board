import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 게시판 v 0.1 ===");
        System.out.println("=== 프로그램 시작 ===");
        System.out.printf("명령) \n");
        Scanner cmd = new Scanner(System.in);
        String text = cmd.nextLine();
        System.out.printf("입력받은 명령어 : %s\n", text);
        System.out.println("=== 프로그램 종료 ===");
    }
}