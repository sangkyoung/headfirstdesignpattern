package chp1;

public interface QuackBehavior {
    public void quack();
}

//subclasses for quacking behavior
class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
    
}
class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
    
}