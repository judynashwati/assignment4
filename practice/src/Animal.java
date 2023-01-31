public class Animal {
    public int age = 10;
    public String gender = "female";

    public void isMammal() {
        System.out.println("This is the method isMammal() from the class Animal");
    }
    public void mate() {
        System.out.println("This is a the method mate() from the class Animal.");
    }
    
public static void main(String [] args){
    Animal myAnimal = new Animal();
    Fish myFish = new Fish();
    Zebra myZebra = new Zebra();

 myAnimal.isMammal();
 myAnimal.mate();
 myZebra.run();
}
}
class Fish extends Animal {
    private int sizeInfeet = 45;

    private void canEat() {
        System.out.println("This is the subclass method canEat from Fish");
    }
}
class Zebra extends Animal {
    public boolean is_wild = true;

    public void run() {
        System.out.println("This is the subclass method run() from Zebra.");
    }
}