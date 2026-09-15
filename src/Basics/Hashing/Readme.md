# Hasing
Hashing is the process of converting a given key into another value. A hash function is used to generate the new value according to a mathematical algorithm. The result of a hash function is known as a hash value or simply, a hash.

### Collision
When 2 keys generate the same hash it is known as collision.
Methods of resolving collision :

1. Separate Chaining

    The idea is to make each cell of the hash table point to a linked list of records that have the same hash function value. Chaining is simple but requires additional memory outside the table.

2. Open Addressing

    1. Linear Probing 

        In linear probing, the hash table is searched sequentially that starts from the original location of the hash. If in case the location that we get is already occupied, then we check for the next location. 

    2. Quadrating Probing

        Quadratic probing operates by taking the original hash index and adding successive values of an arbitrary quadratic polynomial until an open slot is found.

        An example sequence using quadratic probing is : H + 12, H + 22, H + 32, H + 42…………………. H + k2

    3. Double Hashing

        Double hashing is a collision resolving technique in Open Addressed Hash tables. Double hashing make use of two hash function, 

        The first hash function is h1(k) which takes the key and gives out a location on the hash table. But if the new location is not occupied or empty then we can easily place our key. 
        But in case the location is occupied (collision) we will use secondary hash-function h2(k) in combination with the first hash-function h1(k) to find the new location on the hash table. 
        This combination of hash functions is of the form : h(k, i) = (h1(k) + i * h2(k)) % n 

## Hashing in Java

| Topic | HashSet | HashMap | HashTable |
|-------|---------|---------|-----------|
|Implementation| Set Interface | MapInterface | Map Interface |
|Duplicate| X | Stores <K,V> pair if duplicate then replaces new value| Allowed |
|Speed|Slower than HashMap|Faster than Hash Set and HashhTabel| Slower than HashMap |
|Synchronized| X | X |Y|
|Storing/Adding Mechanics|internally uses HashMap|internally uses Hashing|internally uses Hashing|

# Problems

1. Check whether the given array is Subset of another array [SubsetOfArray]