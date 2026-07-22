class MyStack {
    Queue<Integer>q;

    public MyStack() {
        q=new LinkedList<>();
        
    }
    
    public void push(int x) {
        //aga deiya(means offer)
        q.offer(x);
        //rotate the prevois element mane 1 pasila then 2 so as eita queue ta seita 1,2 but amaku darkar 2,1
        for (int i = 0; i < q.size() - 1; i++) {
            q.offer(q.poll());
        }
        
    }
    
    public int pop() {
        return q.poll();
        
    }
    
    public int top() {
        return q.peek();
        
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */