public class Task {

    public static void main(String[] args) {
        System.out.println(getAnimalSound(new Cat()));
    }

    static String getAnimalSound(Animal animal) {
        return switch (animal) {
            case Cat cat -> cat.makeSound();
            case Dog dog -> dog.makeSound();
        };
    }

}


abstract sealed class Animal permits Cat, Dog {
    String makeSound() {
        return null;
    }
}

final class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }
}

final class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}

