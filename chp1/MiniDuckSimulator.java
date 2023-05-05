package chp1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        // test strategy pattern, Ducks and its behaviors are encapsulated in their own classes
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // test setter methods
        Duck model = new ModelDuck();
        model.performFly();
        // change behavior dynamically
        model.setFlyBehavior(()-> System.out.println("Rocket Fly~~!"));
        model.performFly();
    }
}
