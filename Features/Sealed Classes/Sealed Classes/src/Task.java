public class Task {

    public static void main(String[] args) {
        System.out.println(getAnimalSound(new Terrier()));
    }

    static String getAnimalSound(Animal animal) {
        return switch (animal) {
            case Cat cat -> cat.makeSound();
            case Terrier terrier -> terrier.makeSound();
            case Dog dog -> dog.makeSound();
        };
    }

}

abstract sealed class Animal {
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
sealed class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}

sealed class Terrier extends Dog {
    @Override
    public String makeSound() {
        return "Woof Terrier";
    }
}

final class JackRussell extends Terrier {
    @Override
    public String makeSound() {
        return "Woof JackRussell";
    }
}