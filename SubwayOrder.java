public class SubwayOrder  {

    public static void main(String args[]){
        Sandwich sandwich=new Sauce(new Salad(new Bread()));

        System.out.println("Ingredients:"+sandwich.getDescription());
        System.out.println("total cost:"+sandwich.getCost());

        Sandwich sandwich1=new Salad(new Bread());

        System.out.println("Ingredients:"+sandwich1.getDescription());
        System.out.println("total cost:"+sandwich1.getCost());

    }
}
