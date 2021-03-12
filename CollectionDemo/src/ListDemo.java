import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ibm.Book;


public class ListDemo {
	public static void main(String[] args) {
		demo1();
		bookList();
	}
	
	
	public static void bookList() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("learning Java"));
		books.add(new Book("Teaching JavaScript"));
		System.out.println(books);
		
		Iterator <Book> it = books.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if(book.getTitle().contains("Learn")) {
				System.out.println(book);
			}
			
		}
		
		
	}
	public static void demo1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		System.out.println("Before - "+ list);
		list.remove(1);
		System.out.println(list.contains(3));
		System.out.println("After - " + list);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
			
		}
	}

}
