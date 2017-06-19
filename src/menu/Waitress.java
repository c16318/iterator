
package menu;

/**
 *
 * @author c16318
 */
public class Waitress {
    MenuItem d;
    DinerMenu dinerMenu = new DinerMenu();
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

    
    public void printMenu(){
        Iterator dinerIterator = dinerMenu.iterator();
        Iterator pancakeIterator = pancakeHouseMenu.iterator();
        
        printMenu(dinerIterator);
        printMenu(pancakeIterator);
    }
    
    private void printMenu(Iterator it){
        while(it.hasNext()){
            d = (MenuItem)it.next();
            System.out.println("名前:" + d.getName() + " 説明:" + d.getDescription() + " 価格:" + d.getPrice() );
        }
            
    }
}
