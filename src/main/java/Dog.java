public class Dog extends Pet {


    public Dog(String name, String noise) {
        super(name, noise);
    }

    @Override
    public void makeNoise() {
        System.out.println("The dogs name is: "+ getName() + " and it goes " + getNoise());
    }
}
