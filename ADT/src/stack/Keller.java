package stack;

public class Keller<T> {
    //peek() oberstes Element angucken
    //push() Element reinpushen
    //pop() oberstes Element entfernen
    //isEmpty()

    private Item<T> top;

    public Keller(){
        clear();
    }

    public void clear(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(T data){
        Item newItem = new Item<T>(data);

        if(top == null){
            top = newItem;
        } else {
            newItem.setPrevious(top);
            top = newItem;
        }
    }

    public T peek(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        } else {
            return top.getData();
        }
    }

    public T pop(){
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else {
            var data = top.getData();
            top = top.getPrevious();
            return data;
        }
    }

    public int size() {
        Item runner = top;
        int size = 0;

        while (runner != null) {
            runner = runner.getPrevious();
            size += 1;
        }

        return size;
    }
}

class Item<T> {
    private T data;
    private Item<T> previous;

    public Item(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Item getPrevious() {
        return previous;
    }

    public void setPrevious(Item previous) {
        this.previous = previous;
    }
}
