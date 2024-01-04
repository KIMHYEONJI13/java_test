package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.dto.BookDTO;
import com.ohgiraffers.test.view.BookMenu;

public class BookManager {


    BookMenu bookMenu = new BookMenu();
    BookDTO[] arr = null;
    public BookManager() {}  //기본생성자


    public void addBook(BookDTO book) {
        arr = new BookDTO[bookMenu.inputBook()];

    }

    public void deleteBook(int index) {


    }

    public int searchBook(String bTitle) {

       bTitle = bookMenu.inputBookTitle();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(bTitle)) {
                System.out.println(arr[i]);
            }
        }
        return bTitle;
    }

    public void printBook(int index) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\n");
        }

    }

    public void displayAll() {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\n");
        }

    }

    public BookDTO[] sortedBookList(int select) {  //정렬 사용

    }

    public void printBookList(BookDTO[] br) {


    }



}
