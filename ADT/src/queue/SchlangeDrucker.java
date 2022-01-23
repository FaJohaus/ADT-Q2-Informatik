package queue;

// Garbage Collector

public class SchlangeDrucker {
    private Item head;

    public SchlangeDrucker() {
        clear();
    }

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        Item runner = head;
        int size = 0;

        while (runner != null) {
            runner = runner.getNext();
            size += 1;
        }

        return size;
    }

    public void enqueue(String data) {
        Item newItem = new Item(data);

        if (head == null) {
            head = newItem;
        } else if(newItem.getData().length() < head.getData().length()){
            Item runner = head;

            while (runner.getNext() != null) {
                runner = runner.getNext();
            }

            runner.setNext(head);
            head = newItem;
        } else
        {
            Item runner = head;

            while (runner.getNext() != null) {
                runner = runner.getNext();
            }

            runner.setNext(newItem);
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else {
            String data = head.getData();
            head = head.getNext();
            return data;
        }
    }

    public String head() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else {
            return head.getData();
        }
    }
}

class Item {
    private String data;
    private Item next;

    public Item(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }
}
