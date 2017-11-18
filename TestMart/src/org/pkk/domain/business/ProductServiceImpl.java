package org.pkk.domain.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> MoviesList = new ArrayList<String>();
	
	
	public ProductServiceImpl() {
		bookList.add("C"); bookList.add("C++"); bookList.add("Java");
		
		musicList.add("Tum Ho"); musicList.add("Tum Mile"); musicList.add("Aur ho");
		
		MoviesList.add("Eoja"); MoviesList.add("Janvar"); MoviesList.add("Hello");
		
	}


	public List<String> getProducts(String catagories){
		switch(catagories.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movie":
			return MoviesList;
		}
		return null;
	}
	
	
	
	public List<String> getProductCatagories(){
		 List<String> catagories = new ArrayList<String>();
		 catagories.add("Books");
		 catagories.add("Music");
		 catagories.add("Movies");
		 return catagories;
	}


	public boolean addProducts(String catagory, String product) {
		switch(catagory.toLowerCase()){
		case "books":
			return bookList.add(product);
		case "music":
			return musicList.add(product);
		case "movie":
			return MoviesList.add(product);
		default:
				return false;
		}
	}
}
