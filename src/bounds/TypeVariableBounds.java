package bounds;

public class TypeVariableBounds<T extends Number> {
    private final T field;

    public TypeVariableBounds(T field) {
        this.field = field;
    }
}

interface CanConnectToDatabase {
}

class Repository implements CanConnectToDatabase {
}

class Service<R extends CanConnectToDatabase> {
    private final R repository;

    Service(R repository) {
        this.repository = repository;
    }
}

class A<E extends B1 & B2> {
}


interface B1 {
}

interface B2 {
}

interface B3 {
}

class C1 implements B1, B2 {
}

class C2 implements B1, B2, B3 {
}

class TypeVariableBoundsTest {
    public static void main(String[] args) {
//        var t = new TypeVariableBounds<String>("Hello");
        var t2 = new TypeVariableBounds<Long>(15L);
        var t3 = new TypeVariableBounds<Double>(15D);

        Repository repository = new Repository();
        var service = new Service<Repository>(repository);

        var a = new A<C1>();
        var a2 = new A<C2>();
    }
}
