abstract class Bird {
    String color;
    int weight;

    abstract void eat();
    abstract void makeSound();
}


interface FlyType {
    void flystyle();
}


class CrowSparrowfly implements FlyType {
    public void flystyle() {
        System.out.println("Flapping wings at 32 degrees");
    }
}


class PigeonFly implements FlyType {
    public void flystyle() {
        System.out.println("Helicopter-like takeoff at 27 degrees");
    }
}


interface Flyable {
    void fly();
}


interface NonFlyable {
}


class Flyinfo {
    FlyType breed;

    Flyinfo(FlyType breed) {
        this.breed = breed;
    }

    void fly() {
        breed.flystyle();
    }
}

class Crow extends Bird implements Flyable {
    Flyinfo info;

    Crow(FlyType style) {
        info = new Flyinfo(style);
    }

    public void fly() {
        info.fly();
    }

    public void eat() {
        System.out.println("Crow eats plants and grains");
    }

    public void makeSound() {
        System.out.println("Crow makes cawing sounds");
    }
}

class Sparrow extends Bird implements Flyable {
    Flyinfo info;

    Sparrow(FlyType style) {
        info = new Flyinfo(style);
    }

    public void fly() {
        info.fly();
    }

    public void eat() {
        System.out.println("Sparrow eats millet and seeds");
    }

    public void makeSound() {
        System.out.println("Sparrow chirps");
    }
}

class Pigeon extends Bird implements Flyable {
    Flyinfo info;

    Pigeon(FlyType style) {
        info = new Flyinfo(style);
    }

    public void fly() {
        info.fly();
    }

    public void eat() {
        System.out.println("Pigeon eats seeds");
    }

    public void makeSound() {
        System.out.println("Pigeon coos");
    }
}

class Penguin extends Bird implements NonFlyable {
    public void eat() {
        System.out.println("Penguin eats krill and squid");
    }

    public void makeSound() {
        System.out.println("Penguin makes honking sounds");
    }
}

class Ostrich extends Bird implements NonFlyable {
    public void eat() {
        System.out.println("Ostrich eats plants");
    }

    public void makeSound() {
        System.out.println("Ostrich makes deep booming sounds");
    }
}
public class Main{
    public static void main(String[] args) {
          Crow crow = new Crow(new CrowSparrowfly());
          crow.fly();
          Pigeon p1=new Pigeon(new PigeonFly());
          p1.fly();
    }
}