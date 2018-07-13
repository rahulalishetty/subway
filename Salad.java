public class Salad extends Decorator  {
    public Salad(Sandwich newSandwich) {
        super(newSandwich);

        System.out.println("bread");
        System.out.println("salad");
    }

    public String getDescription(){
        return tempSandwich.getDescription()+" ,salad";
    }

    @Override
    public double getCost() {
        return tempSandwich.getCost()+ 0.5;
    }


}
