
package menu;

/**
 *
 * @author c16318
 */
public class DinerMenu {
    private int MAX = 3;
    private int numberOfItems = 0;
    MenuItem[] menuitems;
    
    public DinerMenu(){
        menuitems = new MenuItem[MAX];
        addItem("パスタ","冷たいパスタ",1500);
        addItem("パスタ・スープ","ベーコン入り",1600);
        addItem("スープ","トマトスープ",500);
    }
    
    public void addItem(String name,String descript,int price){
        MenuItem menuitem = new MenuItem(name,descript,price);
        if(numberOfItems > MAX)
            System.err.println("メニューがいっぱい");
        else{
            menuitems[numberOfItems] = menuitem;
            numberOfItems++;
        }
    }
     
     public MenuItem[] getMenuItems(){
         return menuitems;
     }
     
     public MenuItem getMenuItem(int index){
         return menuitems[index];
     }
     
     public int getNumberOfItems(){
         return numberOfItems;
     }
     
     public Iterator iterator(){
         return new DinerMenuIterator(this);
     }
}
