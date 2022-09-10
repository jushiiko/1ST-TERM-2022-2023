package DSA.MODULE_2.Week6_ADTQueue;

import javax.swing.JOptionPane;

public class Queue2 {
    private int num[];
    private int front, rear, capacity;

    public Queue2() {
        capacity = 5;
        num = new int[capacity];
        front = rear = -1;
    }

    public Queue2(int capacity) {
        this.capacity = capacity;
        num = new int[capacity];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    private void errorMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Full", JOptionPane.ERROR_MESSAGE);
    }

    public void enqueue(int data) {
        if (isFull()) {
            errorMessage("Queue is full");
        } else {
            num[++rear] = data;
            front = 0;
        }
    }

    public int dequeue() {
        int val = 0;
        if (isEmpty()) {
            errorMessage("Queue is empty");
            front = -1;
        } else {
            val = num[front];

            for (int i = 0; i < rear; i++) {
                num[i] = num[i + 1];
            }

            rear--;
        }
        return val;
    }

    public String display() {
        String hold = "";
        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Queue is empty";
        }
        return hold;
    }

    public String display3() {
        String hold = "rear->";
        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Queue is empty";
        }
        return hold + "->front";
    }

    public String display2() {
        String hold = "head<-";
        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Queue is empty";
        }
        return hold + "<-rear";
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return num[front];
        }
    }
    public int last() {
        if (isEmpty()) {
            return -1;
        } else {
            return num[rear];
        }
    }

    public int frontValue() {
        return num[front];
    }

    public int rearValue() {
        return num[rear];
    }

    public int getCurrentSize() {
        return rear + 1;
    }

    public int getCapacity() {
        return capacity;
    }

}