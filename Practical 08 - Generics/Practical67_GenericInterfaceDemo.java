/**
 * Practical 67: Generic Interfaces
 * 
 * Concept: Interfaces can be parameterized too, e.g., a generic `Repository<T, ID>` pattern common in real applications.
 * 
 * Question: Define a generic `Repository<T, ID>` interface and a simple in-memory implementation.
 * 
 * Sample Output:
 * User 1: Nimesha
 */

import java.util.*;
interface Repository<T, ID> {
    void save(ID id, T item);
    T findById(ID id);
}
class InMemoryUserRepository implements Repository<String, Integer> {
    private final Map<Integer, String> store = new HashMap<>();
    @Override public void save(Integer id, String item) { store.put(id, item); }
    @Override public String findById(Integer id) { return store.get(id); }
}
public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Repository<String, Integer> repo = new InMemoryUserRepository();
        repo.save(1, "Nimesha");
        System.out.println("User 1: " + repo.findById(1));
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why is this pattern (`Repository<T, ID>`) common in real frameworks? A: It generalizes data-access logic (like Spring Data's `CrudRepository<T, ID>`) across any entity and identifier type.
 * 2. Q: Can a class implement a generic interface with a concrete type argument? A: Yes, as shown — `InMemoryUserRepository` binds `T=String, ID=Integer` concretely.
 */
