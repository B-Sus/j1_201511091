package com.j1.w10;

public class DuckTestDrive {
  public static void testDuck(Duck duck) {
    duck.quack();
  }
  public static void main(String[] args) {
    WildTurkey turkey = new WildTurkey();
    TurkeyAdapter ta = new TurkeyAdapter(turkey);
    // ta.quack();
    testDuck(ta);
  }
}