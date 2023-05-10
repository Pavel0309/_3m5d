public class Main {
    MyHashMap <E, Object> map=new MyHashMap<>();

    private final static Object PRESENT =new Object();

    public boolean add(E e){
        return map.put(e, PRESENT) ==null;

    }

    public boolean remove(E e){
        return map.remove(e) == PRESENT;
    }

    public boolean contains(E e) {
        return map.containsKey(e);
    }
    public int size(){
        return map.size();
    }
}