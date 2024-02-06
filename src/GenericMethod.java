public class GenericMethod {
    public static <T extends Comparable<T>> int compare(T object1, T object2) {
        return object1.compareTo(object2);
    }
}

record Employee(String fullName, Integer age)implements Comparable<Employee>{

    @Override
    public int compareTo(Employee employee) {
        return this.age.compareTo(employee.age);
    }
}

class GenericMethodTest {
    public static void main(String[] args) {
        int compare = GenericMethod.compare(2, 2);
        System.out.println(compare);

        int compare1 = GenericMethod.compare("Hello", "Hi");
        System.out.println(compare1);

        var employee1 = new  Employee("John", 25);
        var employee2 = new  Employee("Ali", 15);

        int compare2 = GenericMethod.compare(employee1, employee2);
        System.out.println(compare2);
    }
}
