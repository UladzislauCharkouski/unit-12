package com.epam.unit12.library;

public class LibraryOperator {
		public static void main(String[] args){
			Library myLibrary = new Library();
			Book bookVasya = new Book("VasyaBook", "Vasya", 100, 2000);
			Book bookPetya = new Book("PetyaBook", "Petya", 100, 2000);
			Book bookValera = new Book("ValeraBook", "Valera", 100, 2000);
			
			myLibrary.add(bookVasya);
			myLibrary.add(bookPetya);
			myLibrary.add(bookValera);
			
			Book findBookbyTitle = myLibrary.findByTitle("ValeraBook");
			if(findBookbyTitle != null){
				System.out.println(findBookbyTitle.toString());
				System.out.println();
			}
			
			Book findBookbyAuthor = myLibrary.findByAuthor("Vasya");
			if(findBookbyAuthor != null){
				System.out.println(findBookbyAuthor.toString());
				System.out.println();
			}
			
			System.out.println(myLibrary.toString());
			System.out.println();
			
			myLibrary.delete(bookPetya);
			
			System.out.println(myLibrary.toString());
		}
}
