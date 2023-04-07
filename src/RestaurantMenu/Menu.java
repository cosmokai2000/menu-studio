package RestaurantMenu;

import java.util.ArrayList;

public class Menu {
    String lastUpdated;
    public ArrayList<MenuItem> items;

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MenuItem) {
        items.add(MenuItem);
//        lastUpdated = currentDateTime;
    }

    public void removeMenuItem(MenuItem) {
        items.remove(MenuItem);
//        lastUpdated = currentDateTime;
    }

    public String printOutMenu() {
        for (MenuItem item : items) {
            System.out.println(MenuItem.printOutMenuItem());
        }
    }
}
