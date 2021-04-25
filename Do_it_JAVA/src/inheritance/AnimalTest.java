package inheritance;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("animal move");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("human move");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("tiger move");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("eagle move");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle()); // 다 같은 코드인데, 쓰임새는 여러 개 (다형성)

        Animal a = new Human();
        test.moveAnimal(a);
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
