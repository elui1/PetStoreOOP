import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();

        System.out.print("Enter the animal name: ");
        String name = sc.next();
        animal.setName(name);

        System.out.print("Enter the animal type: ");
        String type = sc.next();
        animal.setType(type);

        System.out.print("Enter the animal description: ");
        String description = sc.next();
        animal.setDescription(description);

        System.out.print("Enter the animal price: ");
        double price = sc.nextDouble();
        animal.setPrice(price);

        System.out.print("The animal is in stock (true/false): ");
        boolean isInStock = sc.nextBoolean();

        System.out.println(animal.getDescription());
        System.out.println(animal.getType());
        System.out.println(animal.getName());
        System.out.println(animal.getPrice());
        System.out.println(animal.isInStock());

        animal.getPet();

        Animal animal2 = new Animal("Kuma", "bear", "big and brown");
        animal2.getPet();

    }
}
