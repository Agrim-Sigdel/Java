import constructor.Book;

public class Constructor{
    public static void main(String[] args){
       Book book = new Book();
       Book book1 = new Book("Amit");       
       Book book2 = new Book("Agrim", 21);
         book2.printDetails();
         book.printDetails();
         book1.printDetails();
    }
}