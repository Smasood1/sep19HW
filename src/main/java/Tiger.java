public class Tiger extends Pet{


    public Tiger(String name, String noise) {
        super(name, noise);
    }

    @Override
    public void makeNoise() {
        System.out.println("The tigers name is: "+ getName() + " and it goes " + getNoise());
    }
}
