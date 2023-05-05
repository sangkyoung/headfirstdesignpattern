package chp1;


public abstract class Duck {
    // use strategy pattern
    // flyBehavior and quackBehavior are interfaces and we use polymorphism
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    //constructor
    public Duck() {
    }
    
    // all subclasses should implement their own display method
    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    // delegate to the behavior class
    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }

    // setter methods for changing behavior dynamically
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

// subclasses of Duck
class MallardDuck extends Duck {
    // constructor
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
    
}
class ModelDuck extends Duck {
    // constructor
    public ModelDuck() {
        // default behavior
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}