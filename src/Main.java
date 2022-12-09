import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 게시판 v 0.1.4 ===");
        System.out.println("=== 프로그램 시작 ===");

        int LastId = 0;
        //변수 LastId 선언하고, 값을 0으로 초기화

        while(true){
            Scanner cmd = new Scanner(System.in);
            //exit를 입력받기 전까지는 명령어를 계속 입력받아야 된다.
            //while 반복문을 써서 명령어를 계속해서 입력받게함.
            Article article = new Article();
            System.out.printf("명령) ");
            String text = cmd.nextLine();


            if (text.equals("/usr/article/write")){
                System.out.println("== 게시물 작성 ==");
                System.out.printf("제목: ");
                article.Title = cmd.nextLine();
                //Article 객체의 String형 변수 Title에 입력받은 명령 저장 (제목)
                System.out.printf("내용: ");
                //Article 객체의 String형 변수 Body에 입력받은 명령 저장 (내용)
                article.Body = cmd.nextLine();

                int id = ++ LastId;
                //정수형 변수 id 선언
                //전위 연산자에 의해
                //LastId의 현재 값 0에서 1로 증가된다.
                //그리고 증가된 값 1이 변수 id에 저장된다.
                //이후 게시물 작성 명령어를 다시 실행해도
                //변수 LastId의 값이 초기화되지 않기 때문에 (LastId는 while문 외부에서 선언하였음)
                //게시물이 작성될 때 마다, 게시물 번호가 1 씩 증가하게 된다.

                System.out.printf("%d번 게시물이 등록되었습니다.\n", id);

                System.out.printf("제목: %s\n", article.Title);
                System.out.printf("내용: %s\n", article.Body);
            }
            else if(text.equals("-commands")){
                System.out.println("사용 가능한 명령어 목록");
                System.out.println("===================");
                System.out.println("/usr/article/write : 게시물 작성 명령");
                System.out.println("exit : 프로그램 종료 명령");
                System.out.println("===================");
            }
            else if(text.equals("exit")){
                System.out.println("=== 프로그램 종료 ===");
                cmd.close();
                break;
                //String형 변수 text에 exit가 저장되면
                //프로그램 종료 메시지를 출력하고
                //Scanner를 닫고 (cmd.close();)
                //break 문을 통해 반복문을 빠져나온다.
            }
        }
    }
}

class Article {
    String Title;
    String Body;
}

/* 2022.12.07 작업 목록
 * 1. 게시물 작성 (/usr/article/write)
 *  - 제목, 내용을 입력하고, 입력한 내용을 출력한다.
 *  - 등록한 게시물이 몇번째 게시물인지 보여준다.
 *
 * 2. 명령어 목록 생성 (- Commands)
 *  - 현재 사용가능한 명령어의 목록을 보여줌.
 *
 * 2022.12.09 작업 목록
 * - 게시물 번호가 어떤 원리로 증가하는 지에 대한
 *   추가 설명 작성 (변수 id와 LastId의 관계)
 */