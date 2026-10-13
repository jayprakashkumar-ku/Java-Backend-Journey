public class Q04_StudentConstructor {
    String name;

    Q04_StudentConstructor(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Q04_StudentConstructor student =
                new Q04_StudentConstructor("Jay");
        System.out.println(student.name);
    }
}
