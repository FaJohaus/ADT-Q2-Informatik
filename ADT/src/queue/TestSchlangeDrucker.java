package queue;

public class TestSchlangeDrucker {

    private static void testEnqueue() {
        Schlange s = new Schlange();
        System.out.println(s.size());
        System.out.println(s.isEmpty());

        s.enqueue("kurz");
        s.enqueue("seeeeeeeeeeerlang");
        s.enqueue("auuuuuuuuuuchlang");

        System.out.println(s.size());
        System.out.println(s.isEmpty());

        String data = s.dequeue();
        System.out.println(data);

        System.out.println(s.size());
        System.out.println(s.isEmpty());
        data = s.dequeue();
        System.out.println(data);

        System.out.println(s.size());
        System.out.println(s.isEmpty());
        data = s.dequeue();
        System.out.println(data);

        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }

    public static void main(String[] args) {
        testEnqueue();
    }

}