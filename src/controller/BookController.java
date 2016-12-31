package controller;

import java.util.Map;

import model.Books;

public class BookController {

	public String isEmpty(Map<String,String> list){
		
		int len = list.size();
		String tmp[] = {"bookName","authorName","bookEdition","noOfCopies","publicationName","price"};
		String error[] = {"Book Name","Author Name","Book Edition","No Of Copies","Publication Name","Price"};
		for(int i  = 0; i < len; i++){
			if(list.get(tmp[i]).equals(""))return error[i];
		}
		return "OK";
	}
	
	public boolean insert(Map<String, String> list){
		Books books = new Books();
		if(books.insertNewBook(list))return true;
		else return false;
	}
}
