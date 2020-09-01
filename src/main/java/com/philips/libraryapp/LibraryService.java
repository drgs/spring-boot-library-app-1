package com.philips.libraryapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {
	private List<String> bookList = new ArrayList<>();
	
	@SuppressWarnings({"java:S1104"})
	public static ActionLogger actionLogger = new ActionLogger();
	
	public String addBook(String bookName) {
		int bookNumOfPages;
		boolean bookIsNonfiction, languageIsEnglish;
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
		if (bookList.isEmpty()) {
			return null;
		}
		final boolean bookRemoved = bookList.remove(bookName);
		if (bookRemoved) {
			return "Book removed successfully";
		}
		return "Could not remove book";
	}
}
