import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class GenericClass<E> { // type parameter
    private Object[] elementsData;

    public GenericClass() {
        this(3);
    }

    public GenericClass(int capacity) {
        this.elementsData = new Object[capacity];
    }

    public boolean set(int index, E element) {
        Objects.checkIndex(index, elementsData.length);
        elementsData[index] = element;
        return true;
    }

    @SuppressWarnings({"unchecked"})
    public E get(int index) {
        Objects.checkIndex(index, elementsData.length);
        return (E) elementsData[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementsData);
    }
}

class Student{
    private final String id;
    private final String fullName;

    public Student(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<String> languages = new GenericClass<>();  // type argument
        languages.set(0, "Java");
        languages.set(1, "Python");
        languages.set(2, "PHP");
        System.out.println(languages);
        String language = languages.get(0);
        System.out.println(language);

        GenericClass<Student> students = new GenericClass<>(4);
        students.set(0,new Student(UUID.randomUUID().toString(), "Muzaffarov Lazizbek"));
        students.set(1,new Student(UUID.randomUUID().toString(), "Karimov Jahongir"));
        System.out.println(students);
        Student student = students.get(1);
        System.out.println(student);

        GenericClass<Integer> integers = new GenericClass<>();
        integers.set(0, 15);
        integers.set(1, 20);
        integers.set(2, 30);
        System.out.println(integers);
        Integer integer = integers.get(2);
        System.out.println(integer);

    }
}
