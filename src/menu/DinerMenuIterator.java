
package menu;

/**
 *
 * @author c16318
 */
public class DinerMenuIterator implements Iterator{
    private DinerMenu dinerMenu;
    private int index;
    
    public DinerMenuIterator(DinerMenu dinerMenu){
        this.dinerMenu = dinerMenu;
        this.index = 0;
    }
    
    public boolean hasNext(){
        if(index < dinerMenu.getNumberOfItems()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public Object next(){
        MenuItem menu = dinerMenu.getMenuItem(index);
        index++;
        return menu;
    }
}
