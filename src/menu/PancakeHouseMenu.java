
package menu;

import java.util.ArrayList;

/**
 *
 * @author c16318
 */
public class PancakeHouseMenu {
    private ArrayList<MenuItem> menuitems;
    
    public PancakeHouseMenu(){
        menuitems = new ArrayList();
        addItem("パンケーキ","卵焼きとソーセージ付き",800);        
        addItem("ブルーベリーパンケーキ","ブルーベリー入り",850);
        addItem("ワッフル","イチゴ入り",850);
    }
    
    public void addItem(String name,String descript,int price){
        MenuItem menuitem = new MenuItem(name,descript,price);
        menuitems.add(menuitem);
    }
    
    public MenuItem getMenu(int index){
        return menuitems.get(index);
    }
    
    public int getLength(){
        return menuitems.size();
    }
    
    public Iterator iterator(){
        return new PancakeHouseMenuIterator(this);
    }
}
