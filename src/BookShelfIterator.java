/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;
    
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    
    public boolean hasNext(){
        if(index < bookShelf.getLength()){
            return true;
        }
        else{
            return false;
        }
    }
   
    
    public Object next(){
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
    
    public int getIndex(){
        return index;
    }
    
}
