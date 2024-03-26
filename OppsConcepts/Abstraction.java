package OppsConcepts;

public class Abstraction {

  public static void main(String[] args) {
    Horse h = new Horse();
    h.walk();
    System.out.println(h.color);
  }
}

abstract class Animal {

  String color;

  Animal() {
    color = "Brown";
  }

  void eat() {
    System.out.println("Eating");
  }

  abstract void walk();
}

/**
 * Horse
 */
class Horse extends Animal {

  void walk() {
    System.out.println("Walking");
  }

  void changeColor() {
    color = "Brown";
  }
}
