public class LinkItem {
    // Variables to hold the value and the reference to the next LinkItem
    private int value;
    private LinkItem next;

    // Constructor to create a new LinkItem with a given value
    public LinkItem(int value) {
        this.value = value;
        this.next = null;
    }

    // Getters and setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkItem getNext() {
        return next;
    }

    public void setNext(LinkItem next) {
        this.next = next;
    }
}
