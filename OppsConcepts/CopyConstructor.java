package OppsConcepts;
public class CopyConstructor {

  public static void main(String[] args) {
    int marks[] = { 1, 2, 3 };
    Student s = new Student();
    s.name = "Dhvanil";
    s.age = 10;
    s.marks[0] = 2;
    s.marks[1] = 1;
    s.marks[2] = 1;
    Student s1 = new Student(s);
    s.marks[1]=100;
    for (int i = 0; i < marks.length; i++) {
      System.out.println(s1.marks[i]);
    }
  }
}

/**
 * Student
 */
class Student {

  String name;
  int age;
  int marks[];

  Student(Student s) {
    marks = new int[3];
    this.name = s.name;
    this.age = s.age;

    // Shallow Copy
    // this.marks = s.marks;

    // Deep Copy
    for (int i = 0; i < marks.length; i++) {
      this.marks[i]= s.marks[i];
    }

    System.out.println(
      name + " " + age + " " + s.marks[0] + " " + s.marks[1] + " " + s.marks[2]
    );
  }

  Student() {
    marks = new int[3];
  }
}
