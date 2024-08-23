
// Create a class :
// 1. Insert a element with no duplicates
// 2. Remove an element 
// 3. Get an random element with equal probability

import java.util.ArrayList;
import java.util.HashMap;

class Store {
    private ArrayList<Integer> data;
    private HashMap<Integer, Integer> posMap;

    public Store() {
        this.data = new ArrayList<>();
        this.posMap = new HashMap<>();
    }

    public String insert(int value) {
        if (posMap.containsKey(value)) {
            return "Value existed";
        }
        data.add(value);
        posMap.put(value, data.size() - 1);
        return "Value has been added";
    }

    public String remove(int value) {
        if (!posMap.containsKey(value)) {
            return "Value not existed";
        }

        int indexToRemove = posMap.get(value);
        int lastElement = data.get(data.size() - 1);

        // Replace the element to be removed with the last element
        data.set(indexToRemove, lastElement);
        posMap.put(lastElement, indexToRemove);

        // Remove the last element
        data.remove(data.size() - 1);
        posMap.remove(value);

        return "Value has been removed";
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public static void main(String[] args) {
        Store s = new Store();
        System.out.println(s.insert(10)); // Output: Value has been added
        System.out.println(s.insert(10)); // Output: Value existed
        System.out.println(s.insert(12)); // Output: Value has been added
        System.out.println(s.insert(1)); // Output: Value has been added
        System.out.println(s.insert(4)); // Output: Value has been added
        System.out.println(s.insert(8)); // Output: Value has been added
        System.out.println(s.remove(12)); // Output: Value has been removed
        System.out.println(s.getData()); // Output: [10, 8, 1, 4]
    }
}
