import java.util.Iterator;
import java.util.LinkedList;

class Address {

  private String name;
  private String city;
  private String state;

  public Address(String name, String city, String state) {
    this.name = name;
    this.city = city;
    this.state = state;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  @Override
  public String toString() {
    return (
      "Address [ name = " + name + ", city = " + city + ", state = " + state + " ]"
    );
  }
}

class Maillist {

  private LinkedList<Address> list;

  Maillist() {
    this.list = new LinkedList<>();
  }

  public void add(Address address) {
    list.add(address);
  }

  public void display() {
    // Iterator<Address> iterator = list.iterator();
    // while (iterator.hasNext()) {
    //   System.out.println(iterator.next());
    // }
    System.out.println(list);
  }
}

public class Main {

  public static void main(String[] args) {
    Maillist maillist = new Maillist();

    maillist.add(new Address("John Doe", "Los Angeles", "California"));
    maillist.add(new Address("Jane Smith", "New York", "New York"));
    maillist.add(new Address("Bob Johnson", "Chicago", "Illinois"));

    maillist.display();

  }
}
