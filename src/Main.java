class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }
}

class Sheep extends Animal {
    public Sheep(String name) {
        super(name);
    }
}

class AnimalHouse<T extends Animal> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}
public class Main {
    public static void main(String[] args) {
        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
        Cat myCat = new Cat("Mosh");
        catHouse.setAnimal(myCat);
        System.out.println("Cat's name: " + catHouse.getAnimal().getName());

        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();
        Dog myDog = new Dog("Sharik");
        dogHouse.setAnimal(myDog);
        System.out.println("Dog's name: " + dogHouse.getAnimal().getName());
    }
}


