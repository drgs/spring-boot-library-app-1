package com.philips.libraryapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {
	private List<String> bookList = new ArrayList<>();

	@SuppressWarnings({"java:S1104"})
	public static final ActionLogger actionLogger = new ActionLogger();

	public String addBook(String bookName) {
		boolean languageIsEnglish;
		String isbn  = "";

		actionLogger.log("Adding book: " + bookName);

		if (bookName.equals("foo")) {
			return "We do not accept books with this title";
		}

		bookList.add(bookName);
		return "Book with title" + bookName + "has been added";		
	}

//	public String checkStringEqualsFoo(String inputString) {
//		return inputString.equals("foo") ? 
//				"Input string matches foo" : 
//					"Input string does not match foo";
//	}

//	public String checkStringEqualsFoo(String inputString) {
//		return inputString.equals("foo") ? 
//				"Input string matches foo" : 
//					"Input string does not match foo";
//	}
//	
 
	public List<String> getAllBooks() {
		if (bookList.size() > 0) {
			return bookList;
		}
		return new ArrayList<>();
	}

	public String removeBook(String bookName) {
		/*
		 * TODO: IMPLEMENT THIS
		 * 
		 * Requirements:
		 * 1. Add a local variable of type boolean and name it "bookType". This variable will remain unused for now.
		 * 2. Remove the book given as parameter (bookName) from bookList iff bookList has size > 0. Use the method bookList.size().
		 * 		NOTE: You can use the List.remove() method, which returns a boolean if removal is successful.
		 * 3. If the book is successfully removed, return the string "Book removed successfully".
		 * 4. If the book is not removed, return the string "Could not remove book".
		 */
		return null;
	}
}
