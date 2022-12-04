import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 게시판 v 0.1.2 ===");
        System.out.println("=== 프로그램 시작 ===");
        while(true){
            //exit를 입력받기 전까지는 명령어를 계속 입력받아야 된다.
            //while 반복문을 써서 명령어를 계속해서 입력받게함.
            System.out.printf("명령) ");
            Scanner cmd = new Scanner(System.in);
            String text = cmd.nextLine();
            System.out.printf("입력받은 명령어 : %s\n", text);
            if(text.equals("exit")){
                System.out.println("=== 프로그램 종료 ===");
                cmd.close();
                break;
                //String형 변수 text에 exit가 저장되면
                //프로그램 종료 메시지를 출력하고
                //Scanner를 종료시키고
                //반복문을 빠져나온다.
            }
        }
    }
}