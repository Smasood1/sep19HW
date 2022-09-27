public class Main {
    //Create a program that asks the user how many pets they have.
    //Once you know how many pets they have, ask them what kind of pet each one is, along with each pet's name.
    //For now your program should just hold onto the user input and print out the list at the end; we'll modify this in part 3.

    public static void main(String[] args) {
        // int petsQuantity;
        String petsType;
        String petNames;

        Pet dog1 = new Pet("Thanos", "woof");
        //  Pet cat1 = new Pet("Panther","Meow");
        //  Pet tiger1 = new Pet("tigger","Growl");


        /*
        Scanner in = new Scanner(System.in);
        //System.out.println("How many pets do you have?");
        Scanner in2 = new Scanner(System.in);
        //petsQuantity = in.nextInt();
        System.out.println("What kind of pets are they?");
        petsType = in.nextLine();
        //in.nextLine();
        System.out.println("What are there names?");
        petNames = in2.nextLine();
        //  System.out.println("Number of pets: "+petsQuantity +"\nType of pet: "+ petsType +"\nNames of the pets: "+ petNames);
        System.out.println("Type of pets: " + petsType + "\nNames: " + petNames);
*/

        Cat cat2 = new Cat("Coco", "Meow");
        Dog dog2 = new Dog("Chanel", "Woof");
        Tiger tiger2 = new Tiger("Gucci", "Rawr");


        // dog1.setName("Godzilla");
        // System.out.println(cat1.getName());
        // Tiger.makeNoise(tiger2);

        dog2.makeNoise();
        cat2.makeNoise();
        tiger2.makeNoise();
    }
}