class Node {
    int value;
    Node next;
    int minimumValue;

    Node (int value, Node next, int minimumValue) {
        this.value = value;
        this.next = next;
        this.minimumValue = minimumValue;
    }
}
class MinStack {
    Node head = null;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if (head == null) {
            head = new Node(val, null, val);
        } else {
            int minimumValue = head.minimumValue;
            if (head.minimumValue > val) {
                minimumValue = val;
            }
            Node newNode = new Node(val, head, minimumValue);
            head = newNode;
        }
    }
    
    public void pop() {
        if (head == null) {
            return;
        }
        head = head.next;
    }
    
    public int top() {
        return head.value;
    }
    
    public int getMin() {
        return head.minimumValue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */