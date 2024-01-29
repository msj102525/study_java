package practice3;

import java.util.Scanner;

import practice2.Book;

public class TestBookManagerMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManagerMap bManagerMap = new BookManagerMap();
        int num;

        do {
            System.out.println("*** 도서 관리 프로그램 ***");

            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴선택 : ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    bManagerMap.putBook(inputBook(sc));
                    break;
                case 2:
                    Book[] sortedBooks = bManagerMap.sortedBookMap();
                    bManagerMap.printBookMap(sortedBooks);
                    break;
                case 3:
                    System.out.print("삭제할 도서번호 : ");
                    String deleteKey = sc.next();
                    bManagerMap.removeBook(deleteKey);
                    break;
                case 4:
                    sc.nextLine(); // 버퍼 비우기
                    System.out.print("검색할 도서명 : ");
                    String bTitle = sc.nextLine();
                    String searchKey = bManagerMap.searchBook(bTitle);
                    if (searchKey != null) {
                        bManagerMap.printBook(searchKey);
                    } else {
                        System.out.println("도서를 찾지 못했습니다.");
                    }
                    break;
                case 5:
                    bManagerMap.displayAll();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("다시입력");
                    break;
            }

        } while (num != 6);

        sc.close(); // 스캐너 종료
    }

    // Book 입력 메서드
    private static Book inputBook(Scanner scanner) {
        System.out.print("책번호: ");
        String bNo = scanner.next();

        System.out.print("카테고리 번호: ");
        int category = scanner.nextInt();

        System.out.print("책제목: ");
        String title = scanner.next();

        System.out.print("책저자: ");
        String author = scanner.next();

        return new Book(bNo, category, title, author);
    }
}
