package RestaurantMenu;

public class MenuItem {
     double price = 0;
     String description = "food";
     String category = "appetizer";
     boolean itemNew = false;

     public MenuItem(double price, String description, String category, boolean itemNew) {
          this.price = price;
          this.description = description;
          this.category = category;
          this.itemNew = itemNew;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public String getCategory() {
          return category;
     }

     public void setCategory(String category) {
          this.category = category;
     }

     public void setItemNew(boolean itemNew) {
          this.itemNew = itemNew;
     }

     public boolean isItemNew() {
          return this.itemNew;
     }

     public String printOutMenuItem(){
          return this.description;
     }
}


