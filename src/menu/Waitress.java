
package menu;

/**
 *
 * @author c16318
 */
public class Waitress {
   // Menu pancakeMenu;
    MenuItem d;
    
    DinerMenu dinerMenu = new DinerMenu();
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
   // Iterator it = dinerMenu.iterator();
    
    public void printMenu(){
        //Iterator pancakeIterator = 
        Iterator dinerIterator = dinerMenu.iterator();
        Iterator pancakeIterator = pancakeHouseMenu.iterator();
        
        printMenu(dinerIterator);
    }
    
    private void printMenu(Iterator it){
        while(it.hasNext()){
            d = (MenuItem)it.next();
            System.out.println("名前:" + d.getName() + " 説明:" + d.getDescription() + " 価格:" + d.getPrice() );
        }
            
    }
}
