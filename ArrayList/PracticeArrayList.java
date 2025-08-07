import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class PracticeArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> vegetables = new ArrayList<>(Arrays.asList("carrot", "broccoli", "spinach"));
        ArrayList<String> backup = new ArrayList<>(10);

        System.out.println("Empty ArrayList: " + fruits);
        System.out.println("ArrayList with elements: " + vegetables);

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println("After add(): " + fruits);

        fruits.add(1, "grape");
        System.out.println("After add(index, element): " + fruits);

        fruits.addAll(Arrays.asList("mango", "kiwi"));
        System.out.println("After addAll(): " + fruits);

        fruits.addAll(2, Arrays.asList("pear", "peach"));
        System.out.println("After addAll(index, collection): " + fruits);

        System.out.println("get(0): " + fruits.get(0));
        System.out.println("First element: " + fruits.get(0));
        System.out.println("Last element: " + fruits.get(fruits.size() - 1));

        System.out.println("indexOf('banana'): " + fruits.indexOf("banana"));
        System.out.println("lastIndexOf('apple'): " + fruits.lastIndexOf("apple"));
        System.out.println("contains('mango'): " + fruits.contains("mango"));
        System.out.println("containsAll(['apple', 'banana']): " +
                fruits.containsAll(Arrays.asList("apple", "banana")));

        System.out.println("size(): " + fruits.size());
        System.out.println("isEmpty(): " + fruits.isEmpty());
        fruits.ensureCapacity(20);
        fruits.trimToSize();

        System.out.println("Original: " + fruits);
        fruits.set(0, "red apple");
        System.out.println("After set(0, 'red apple'): " + fruits);

        fruits.remove("grape");
        System.out.println("After remove('grape'): " + fruits);

        fruits.remove(1);
        System.out.println("After remove(1): " + fruits);

        fruits.removeAll(Arrays.asList("pear", "peach"));
        System.out.println("After removeAll(['pear', 'peach']): " + fruits);

        fruits.addAll(Arrays.asList("apple", "banana", "cherry"));
        System.out.println("Added duplicates: " + fruits);

        fruits.retainAll(Arrays.asList("red apple", "banana", "orange", "mango"));
        System.out.println("After retainAll: " + fruits);

        System.out.print("Enhanced for loop: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        System.out.print("Iterator: ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator (forward): ");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator (backward): ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        Object[] array1 = fruits.toArray();
        System.out.println("toArray(): " + Arrays.toString(array1));

        String[] array2 = fruits.toArray(new String[0]);
        System.out.println("toArray(T[]): " + Arrays.toString(array2));

        ArrayList<String> subList = new ArrayList<>(fruits.subList(1, 3));
        System.out.println("subList(1, 3): " + subList);

        ArrayList<String> copyList = new ArrayList<>(fruits);
        System.out.println("Original: " + fruits);
        System.out.println("Copy: " + copyList);
        System.out.println("equals(): " + fruits.equals(copyList));
        System.out.println("hashCode(): " + fruits.hashCode());

        Collections.sort(fruits);
        System.out.println("After Collections.sort(): " + fruits);

        Collections.reverse(fruits);
        System.out.println("After Collections.reverse(): " + fruits);

        Collections.shuffle(fruits);
        System.out.println("After Collections.shuffle(): " + fruits);

        System.out.println("Before clear(): " + copyList);
        copyList.clear();
        System.out.println("After clear(): " + copyList);
        System.out.println("isEmpty() after clear: " + copyList.isEmpty());

        ListIterator<String> advancedIterator = fruits.listIterator();
        System.out.println("Original: " + fruits);

        while (advancedIterator.hasNext()) {
            String current = advancedIterator.next();
            if (current.equals("banana")) {
                advancedIterator.set("BANANA");
            }
            if (current.equals("mango")) {
                advancedIterator.add("coconut");
            }
        }
        System.out.println("After ListIterator modifications: " + fruits);

        System.out.println("Final fruits list: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("toString(): " + fruits.toString());
    }
}
