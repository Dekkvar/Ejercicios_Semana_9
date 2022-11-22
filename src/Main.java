/**
 * @author Aitor Couñago Figueroa
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setHair("corto");
        dog1.setColor("negro");
        dog1.setChip(1);

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[0].setHeight(5);
        dogs[0].setWeight(5);
        dogs[1] = new Dog();
        dogs[1].setHeight(5);
        dogs[1].setWeight(25);
        dogs[2] = new Dog();
        dogs[2].setHeight(25);
        dogs[2].setWeight(30);

        for (Dog d:dogs) {
            System.out.println(d.bark());
        }
    }
}
