interface Vehical {
    void speed();

}

public class Car implements Vehical {
    public void speed() {
        int distacne = 1000;
        int time = 20;
        int calSpeed = distacne / time;
        System.out.println("Speed of car : " + calSpeed);
    }

    public static void main(String[] args) {

        Car k1 = new Car();
        Bike k2 = new Bike();
        Ecar k3 = new Ecar();
        k1.speed();
        k2.speed();
        k3.speed();
    }
}

class Bike {

    public void speed() {
        int distacne = 1000;
        int time = 35;
        int calSpeed = distacne / time;
        System.out.println("Speed of bike : " + calSpeed);
    }
}

class Ecar {
    public void speed() {
        int distacne = 1000;
        int time = 60;
        int calSpeed = distacne / time;
        System.out.println("Speed of Ecar : " + calSpeed);
    }
}
