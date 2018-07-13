public class Sauce extends Decorator {
    public Sauce(Sandwich newSandwich) {
        super(newSandwich);
    }

    public String getDescription(){
        return tempSandwich.getDescription()+", sauce";
    }

    @Override
    public double getCost() {
        return tempSandwich.getCost()+0.35;
    }
}
