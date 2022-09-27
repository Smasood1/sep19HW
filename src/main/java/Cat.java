public class Cat extends Pet {

    public Cat(String name, String noise) {
        super(name, noise);

    }

    @Override
    public void makeNoise() {
        System.out.println("The cats name is: "+ getName() + " and it goes " + getNoise());
    }
}
