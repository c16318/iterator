
package menu;

import java.util.ArrayList;

/**
 *
 * @author c16318
 */


public class PancakeHouseMenuIterator implements Iterator{
    private PancakeHouseMenu pancakeHouseMenu;
    private int index;
    
    
    public PancakeHouseMenuIterator(PancakeHouseMenu pancakeHouseMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.index = 0;
    }
    
    public boolean hasNext(){
        if(index < pancakeHouseMenu.getLength())
            return true;
        else
            return false;
    }
    
    public Object next(){
        
    }

}

