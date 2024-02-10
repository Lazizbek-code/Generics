import java.util.Arrays;

class SimpleArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public SimpleArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}

public class App {
    public static void main(String[] args) {
        SimpleArrayList<String> list = new SimpleArrayList<>();

        // add(element)
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // get(index)
        System.out.println("Element at index 1: " + list.get(1)); // Banana

        // size()
        System.out.println("Size of the list: " + list.size()); // 3

        // remove(index)
        list.remove(0);

        // isEmpty()
        System.out.println("Is list empty? " + list.isEmpty()); // false

        // clear()
        list.clear();
        System.out.println("Is list empty after clear? " + list.isEmpty()); // true
    }
}
