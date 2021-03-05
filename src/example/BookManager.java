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
		System.out.println("*****책 삭제*****");
		for(int i=0;i<size;i++) {
			if(books[i].getTitle().equals(title)) {
				for(;i<size;i++) {	books[i]=books[i+1];	}
			}
		}size--;
	}
	public void getList() {
		//도서 목록 기능
	}
	public void searchByTitle(String title) {
		//도서 검색 기능
	}
}
