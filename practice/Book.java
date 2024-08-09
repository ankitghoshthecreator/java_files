package practice;

public class Book {
    String author;
    String title;
    int price;
    
    Book(String t, String a){
       this.title = t;
       this.author = a;
    }
    Book(String t, String a, int p){
        this.author = a;
        this.title = t;
        this.price = p;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java", "Sachin");
        System.out.println(book1.author);
        System.out.println(book1.price);

        Book book2 = new Book("Java", "Sachin", 100);
        System.out.println(book2.author);
        System.out.println(book2.price);

    }
}
