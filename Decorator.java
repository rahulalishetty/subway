public abstract class Decorator implements Sandwich {
    protected Sandwich tempSandwich;

    public Decorator(Sandwich newSandwich){
        tempSandwich=newSandwich;
    }

    public String getDescription(){
        return tempSandwich.getDescription();
    }

    public double getCost(){
        return tempSandwich.getCost();
    }

}
