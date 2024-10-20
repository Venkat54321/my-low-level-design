package lrucache;

public class Main {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.put(3,3);
        lruCache.put(4,4);
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.get(3));
        lruCache.put(6,6);
    }
}
