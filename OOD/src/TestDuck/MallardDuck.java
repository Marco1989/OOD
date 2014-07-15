package TestDuck;

public class MallardDuck extends Duck {
public MallardDuck() {
quackBehavior = new Quack();
flyBehavior = new FlyWithWings();
}
public void display() {
System.out.println("IÕm a real Mallard duck");
}
}
