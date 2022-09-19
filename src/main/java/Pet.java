public class Pet {

    private String name;
    private String noise;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", noise='" + noise + '\'' +
                '}';
    }

    public Pet (String name, String noise){
        this.name = name;
        this.noise = noise;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }



    public void makeNoise(){
        System.out.println("This animal is making noise");
    }










}
