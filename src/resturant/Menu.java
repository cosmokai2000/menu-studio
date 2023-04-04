package resturant;

import java.util.ArrayList;

public class Menu {
    String lastUpdated;
    private ArrayList<MenuItem> items;

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
