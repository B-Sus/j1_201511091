package com.j1.w12;

public class DinerMenu {
  static final int MAX_ITEMS = 3;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  public DinerMenu() {
    menuItems = new MenuItemp[MAX_ITEMS];
    addItem("BLT", "wowwowowowowowowow", false, 2.9);
    addItem("apple", "asdsda", true, 0.9);
    addItem("grape", "gragragargar", true, 1.9);
  }
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n, d, v, p);
    if (numberOfItems >= MAX_ITEMS) {
      System.out.println("Error");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems += 1;
    }
  }
}