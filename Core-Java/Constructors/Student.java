public class Student {
    String name;
    int age;

    // No-argument constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student first = new Student();
        Student second = new Student("Jay", 22);

        first.display();
        second.display();
    }
}
