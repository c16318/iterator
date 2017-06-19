/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class BookShelf implements Aggregate{
    private Book[]  books;
    private int last=0;
    
    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }
    
    public Book getBookAt(int index){
        return books[index];
    }
    
    public void appendBook(Book book){
        this.books[last] = book;
        last++;
   }
    
    public int getLength(){
        return last;
    }
    
    public Iterator iterator(){
        return new BookShelfIterator(this);
    } 
    
}
