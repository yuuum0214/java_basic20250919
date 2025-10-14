package etc.generic.good;
//K : Key , V : Value
public class MultiBox<K, V> {

    private K key;
    private V value;

    public void put(K key, V value){
        this.key = key;
        this.value = value;
    }

    public V get(K key){
        return value;
    }
}
