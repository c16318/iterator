
/**
 *
 * @author c16318
 */
public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around ths World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderlla"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(it.getIndex() + ":"+book.getName());
            
            
        }
        
    }
}
