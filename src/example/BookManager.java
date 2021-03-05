package example;

public class BookManager {
	int MAX_SIZE=100;
	Book[] books=new Book[MAX_SIZE];
	int size=0;
	
	public void add(String title,String author) {
		Book b=new Book();
		b.setTitle(title);
		b.setAuthor(author);
		
		books[size++]=b;
	}
	public void remove(String title) {
		//도서 삭제 기능
	}
	public void getList() {
		//도서 목록 기능
	}
	public void searchByTitle(String title) {
		//도서 검색 기능
	}
}
