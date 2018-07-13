public class Bread implements Sandwich {
    @Override
    public String getDescription() {
        return "plain bread";
    }

    @Override
    public double getCost() {
        return 2.00;
    }
}
