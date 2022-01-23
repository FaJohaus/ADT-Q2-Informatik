package queue;

// Garbage Collector

public class SchlangeO {
    private ItemO head;

    public SchlangeO() {
        clear();
    }

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        ItemO runner = head;
        int size = 0;

        while (runner != null) {
            runner = runner.getNext();
            size += 1;
        }

        return size;
    }

    public void enqueue(Object data) {
        ItemO newItemO = new ItemO(data);

        if (head == null) {
            head = newItemO;
        } else {
            ItemO runner = head;

            while (runner.getNext() != null) {
                runner = runner.getNext();
            }

            runner.setNext(newItemO);
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else {
            Object data = head.getData();
            head = head.getNext();
            return data;
        }
    }

    public Object head() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else {
            return head.getData();
        }
    }
}

class ItemO {
    private Object data;
    private ItemO next;

    public ItemO(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ItemO getNext() {
        return next;
    }

    public void setNext(ItemO next) {
        this.next = next;
    }
}
