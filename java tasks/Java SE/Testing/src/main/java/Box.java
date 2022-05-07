public class Box<K, V, T> {
    private K id;
    private V value;
    private T value2;

    public Box(K key, V value, T value2) {
        this.id = id;
        this.value = value;
        this.value2 = value2;
    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }
}