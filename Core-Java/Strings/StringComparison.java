public class StringComparison {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Java";
        String third = new String("Java");

        System.out.println(first == second);      // true: same pooled literal reference
        System.out.println(first == third);       // false: third is a distinct object
        System.out.println(first.equals(third));  // true: same text content
    }
}
