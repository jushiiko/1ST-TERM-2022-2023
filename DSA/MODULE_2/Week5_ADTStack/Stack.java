package DSA.MODULE_2.Week5_ADTStack;

/**
 * Stack is a LIFO Algorithm
 * 
 * @author John Ablay
 */
public class Stack {
    private int num[], top, capacity;
    private String found;

    public Stack() {
        top = -1;
        setCapacity(5);

    }

    public Stack(int capacity) {
        top = -1;
        setCapacity(capacity);
    }

    public void setCapacity(int capacity) {
        if (!isEmpty()) {
            System.err.println("Stack has values at current");
        } else {
            top = -1;
            this.capacity = capacity;
            num = new int[capacity];
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int top() {
        return top;
    }

    public int atTop() {
        return num[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top <= -1);
    }

    public boolean isFull() {
        return (top >= (capacity - 1));
    }

    public int peek() {
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        } else {
            return num[top];
        }

    }

    public int last() {
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        } else {
            return num[top];
        }

    }

    public int first() {
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        } else {
            return num[0];
        }
    }

    public void push(int data) {
        if (isFull()) {
            System.err.println("Stack is full");
        } else {
            top++;
            num[top] = data;
            compare();
            System.out.println(top + " " + num[top]);
        }
    }

    public int pop() {
        int val = 0;
        if (isEmpty()) {
            System.err.println("Stack is empty");
        } else {
            val = num[top];
            top--;
        }
        return val;
    }

    public String display() {
        String hold = " ";
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Stack is empty";
        }
        return hold;
    }

    public void compare() {
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i] == num[j] && i != j && num[i] != 0) {
                    System.out.println("Number is a duplicate of an element.");
                    System.exit(0);
                }
            }
        }
    }

    public boolean search(int data) {
        for (int i = 0; i <= top + 1; i++) {
            if (num[i] == data) {
                found = data + " is at position: " + (i + 1);
                return true;
            }
        }
        found = data + " not found.";
        return false;
    }

    public String clear() {
        if (isEmpty()) {
            return "The stack is empty.";
        } else {
            num = null;
            return "The stack has been cleared.";
        }
    }

    public String empty() {
        if (top <= -1) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public boolean full() {
        if (isFull()) {
            return true;
        } else {
            return false;
        }
    }
}