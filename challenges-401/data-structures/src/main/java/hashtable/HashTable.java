package hashtable;

/**
 *
 *  HashTable implementation with Linear probing
 *
 *  Reference: https://algs4.cs.princeton.edu/34hash/LinearProbingHashST.java.html
 */
public class HashTable<Key, Value> {

    private static final int INIT_CAPACITY = 4;

    // number of key-value pairs in the symbol table
    private int keyValueNum;
    // size of linear probing table
    private int size;
    private Key[] keys;
    private Value[] vals;

    //Constructor initializes an empty table with initial capacity of 4
    public HashTable() {
        this(INIT_CAPACITY);
    }

    //Constructor with initial capacity
    public HashTable(int capacity) {
        if(capacity < 1){
            this.size = INIT_CAPACITY;
        } else{
            size = capacity;
        }

        keyValueNum = 0;
        keys = (Key[])   new Object[size];
        vals = (Value[]) new Object[size];
    }


    /**
     * Add the key-value pair to the hashtable. If key is existing, value is overwritten.
     * @param key
     * @param val
     */
    public void add(Key key, Value val){
        if(key == null){
            throw new IllegalArgumentException("Invalid null key!");
        }

        // TODO: if value is null delete the key
//        if(val == null)


        //verify if the load factor is still within allowed percentage
        checkLoadFactor();
        int i;
        // Check if the key already exists, if so overwrite value
        for (i = hash(key); keys[i] != null; i = (i + 1) % size) {
            if (keys[i].equals(key)) {
                vals[i] = val;
                return;
            }
        }
        //Add key and value to the table
        keys[i] = key;
        vals[i] = val;
        //update key-value number
        keyValueNum++;
    }

    /**
     * Hash function for keys - returns value between 0 and M-1
     * @param key
     * @return int hashcode
     */
    public int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % size;
    }

    /**
     * Return value associated to the key
     * @param key
     * @return value
     */
    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Cannot get null key.");
        }
        for (int i = hash(key); keys[i] != null; i = (i + 1) % size) {
            if (keys[i].equals(key)) {
                return vals[i];
            }
        }
        return null;
    }

    /**
     * Method that checks if the key is in the hashtable.
     * @param key to search
     * @return true if key exists, otherwise, false
     */
    public boolean contains(Key key) {
        if (key == null){
            throw new IllegalArgumentException("Cannot find a null key.");
        }
        return get(key) != null;
    }



    /**************************** HELPERS *********************************/


    //Check if load factor of 0.5 is exceeded
    private void checkLoadFactor(){
        if(keyValueNum >= size/2){
            resize(2 * size);
        }
    }

    // resizes the hash table to the given capacity by re-hashing all of the keys
    private void resize(int capacity) {
        HashTable<Key, Value> temp = new HashTable<Key, Value>(capacity);
        for (int i = 0; i < size; i++) {
            if (keys[i] != null) {
                temp.add(keys[i], vals[i]);
            }
        }
        keys = temp.keys;
        vals = temp.vals;
        size = temp.size;
    }


}
