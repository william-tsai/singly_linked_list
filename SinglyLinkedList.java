public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (this.head == null) {
            System.out.println("List is empty.");
        } else {
            Node runner = this.head;
            while(runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }
    public void printValues() {
        if (this.head == null) {
            System.out.println("List is empty.");
        } else {
            Node runner = this.head;
            System.out.println(runner.value);
            while(runner.next != null) {
                runner = runner.next;
                System.out.println(runner.value);
            }
        }
    }
    public String find(int value) {
        if (this.head == null) {
            return "List is empty.";
        } else if (this.head.next == null) {
            if (this.head.value == value) {
                return this.head.toString();
            } else {
                return value + " is not found in the list";
            }
        } else {
            Node runner = this.head;
            while (runner.next != null) {
                if (runner.value == value) {
                    return runner.toString();
                } else {
                    runner = runner.next;
                }
            }
            return value + " is not found in the list";
        }
    }
    public void removeAt(int num) {
        Node runner = this.head;
        Node walker = this.head;
        if (num == 0) {
            runner = runner.next;
            this.head = runner;
        } else if (num == 1) {
            runner = runner.next.next;
            walker.next = runner;
        } else {
            runner = runner.next.next;
            for (int i = 0; i < num - 1; i++) {
                walker = walker.next;
                runner = runner.next;
            }
            walker.next = runner;
        }
        
    }
}