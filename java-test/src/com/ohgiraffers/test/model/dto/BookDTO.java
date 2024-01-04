package com.ohgiraffers.test.model.dto;

public class BookDTO {


    private int bNo;            //도서 번호
    private int category;       //도서분류코드
    private String title;       //도서 제목
    private String author;      //도서 저자

    public BookDTO() {}

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public void setCategory(int category) {
        int num = 0;
        switch (num) {   //작성 위치 다시 확인
            case 1 : System.out.println(this.category + "인문"); break;
            case 2 : System.out.println(this.category + "자연과학"); break;
            case 3 : System.out.println(this.category + "의료"); break;
            case 4 : System.out.println(this.category + "기타"); break;
            default: System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요."); break;
        }


        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }
    public int getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "bNo=" + this.bNo + ", category=" + this.category + ", title=" + this.title + ", author=" + this.author;


    }



}
