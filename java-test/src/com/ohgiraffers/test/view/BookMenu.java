package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {


    private Scanner sc = new Scanner(System.in);

    private BookManager bm;

    public BookMenu() {}

    /*
    * 북 메니저
        public void addBook(BookDTO book)   //책 추가
        public void deleteBook(int index)   //책 삭제
        public int searchBook(String bTitle) //책 검색
        public void printBook(int index)        //책 복사
        public void displayAll()                //모든 책
        public BookDTO[] sortedBookList(int select) //책 선택
        public void printBookList(BookDTO[] br)    //모든 책리스트 확인
       * */


    public void menu() {

        int no = 0;
        while (true) {
            System.out.println("==== 도서관리 프로그램 ====");
            System.out.println("1. 도서 정보 추가");
            System.out.println("2. 도서 정보 삭제");
            System.out.println("3. 도서명 검색");
            System.out.println("4. 도서 정보 ");
            System.out.println("5. 도서 목록 확인");

            switch (no) {
                case 1 : bm.addBook(); break;
                case 2 : bm.deleteBook(); break;
                case 3 : bm.searchBook(); break;
                case 4 : bm.printBook(); break;
                case 5 : bm.displayAll(); break;
                case 6 : bm.sortedBookList(); break;
                case 7 : bm.printBookList(); break;
                case 9 : System.out.println("프로그램을 종료합니다."); break;
                default: System.out.println("잘목된 번호를 입력하셨습니다."); break;
            }
        }

    }

    public BookDTO inputBook() {
        System.out.print("도서번호를 입력하세요 : ");
        int bNo = sc.nextInt();

        System.out.print("도서 분류코드를 입력하세요 : ");
        int category = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 제목을 입력하세요 : ");
        String title = sc.nextLine();

        System.out.print("도서 저자를 입력하세요 : ");
        String author = sc.nextLine();

        BookDTO book = new BookDTO(category, title, author);
        book.setbNo(bNo);


        return book;
    }

    public String inputBookTitle() {

        System.out.print("검색하실 도서를 입력해 주세요 : ");
        String bName = sc.nextLine();

        return bName;
    }



}
