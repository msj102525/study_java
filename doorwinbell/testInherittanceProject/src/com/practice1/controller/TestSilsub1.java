package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		
		System.out.println(book1.toString());
		System.out.println(book2);
		
		System.out.println(book1.equals(book2));
		
		Book book3 = (Book)book1.clone();
		
		System.out.println("주소 같음 ? : " + book3.equals(book2));
		System.out.println("값이 같음 ? : " + (book3 == book2));
		
		
		

	}

}
