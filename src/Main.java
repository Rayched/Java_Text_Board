import java.util.Scanner;
//java class library에서 Scanner 클래스를 호출함

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 게시판 v 0.1.1 ===");
        System.out.println("=== 프로그램 시작 ===");
        System.out.printf("명령) \n");
        //명령어 입력
        Scanner cmd = new Scanner(System.in);
        //Scanner 객체 생성 및 객체를 조종할 변수 cmd 선언(리모컨)
        String text = cmd.nextLine();
        //String형 변수 text를 선언
        //해당 변수가 string 형 값을 입력받고, 리턴함
        //String형 변수 text가 입력받은 거를 저장한다고 생각해도 된다.
        //cmd.nextLine(); => Scanner의 입력 Method
        System.out.printf("입력받은 명령어 : %s\n", text);
        //변수 text에 저장된 값을 출력한다.
        //입력받은 명령어가 무엇인지를 보여줌.
        System.out.println("=== 프로그램 종료 ===");
    }
}