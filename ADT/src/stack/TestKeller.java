package stack;

public class TestKeller {
    private static void testKeller(){
        Keller<Student> keller = new Keller<>();
        keller.push(new Student(1, "Alisa", "Foo"));
        keller.push(new Student(2, "Alica", "Bar"));
        keller.push(new Student(3, "Alice", "Baz"));
        System.out.println(keller.peek().getNachname());
    }

    public static void main(String[] args) {
        testKeller();
    }
}
