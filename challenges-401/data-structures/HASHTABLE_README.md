# Hashtables
Implement hashtable which stores key-value pairs. Each key is unique but values can repeat but should be associated with a different key.

## Challenge
Implement hashtable with collision handling.

## Approach & Efficiency
The approach is to use arrays to store the keys and values. 

A 0.50 load factor is also used for rehashing, where the sizes of the arrays are doubled. This is a requirement for open addressing scheme, specifically  linear probing, which is used to handle the collision. Open addressing requires that the load factor is
always at most 1 and that entries are stored directly in the cells of the bucket array. Linear probing resolve a collision by moving to another index. 

### Complexities
1. add - with reshashing, space complexity is O(n), time is 0(n) when verifying if they key exists.
2. hash - average time and space are O(1). Worst time is O(n).
3. contains - average time and space are O(1). Worst time is O(n).
4. get - average time and space are O(1). Worst time is O(n).
                                                                                                                                                                                                                                             

## API
1. add - method to add into the hashtable. Parameters are the key-value pair. 
2. hash - method to return hashcode of the key. Returns integer value.
3. contains - checks if the key exist in the table. Parameter is the key and it returns boolean.
4. get - method that returns corresponding value of the key. Parameter is the key.
        