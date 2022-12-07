import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 게시판 v 0.1.3 ===");
        System.out.println("=== 프로그램 시작 ===");

        int articleLastId = 0;
        //마지막으로 작성한 게시물 번호를 저장하는 변수
        //처음 시작할 때, 작성한 게시물의 수는 0개이다.

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

                int id = ++ articleLastId;
                //게시물의 번호 역할을 할, int형 변수 id 선언
                //전위 연산자는 먼저 값을 증감하고 실행하기 때문에
                //실질적으로 변수 articleLastId에 담기는 값은 1 증가한 값이다.
                //++ articleLastId = 0 → 1
                //따라서 변수 id에 담기는 값은 정수 1이다.
                //그리고 게시물 등록을 한번 더 하면
                //'++ articleLastId'에 의해서
                //articleLastId에 담긴 현재 값 1이 2로 증가되어
                //변수 id에 저장된다.

                System.out.printf("%d번 게시물이 등록되었습니다.\n", id);

                System.out.printf("제목: %s\n", article.Title);
                System.out.printf("내용: %s\n", article.Body);
            }
            else if(text.equals("- Commands")){
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
 */