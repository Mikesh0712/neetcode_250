class LRUCache {
    int capacity;
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        return -1;

        //if recently used then move to end
        list.remove(Integer.valueOf(key));
        list.add(key);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {//key already exists
        map.put(key,value);
        list.remove(Integer.valueOf(key));//move it to end as it was recently used
        list.add(key);
        return ;
        }

        if(list.size()==capacity)//cache is full
        {
        int oldKey=list.get(0);
        list.remove(0);
        map.remove(oldKey);
        }
        //add new key
        map.put(key, value);
        list.add(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */