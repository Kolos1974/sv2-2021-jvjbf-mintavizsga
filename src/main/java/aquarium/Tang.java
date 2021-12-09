package aquarium;

public class Tang extends Fish {

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        this.setMemoryLoss(true);
    }

    @Override
    public void feed() {
        this.setWeight(this.getWeight()+1);
    }

}
