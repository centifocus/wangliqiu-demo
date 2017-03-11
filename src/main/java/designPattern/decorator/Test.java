package designPattern.decorator;


public class Test {

    public static void main(String[] args) {
        Source source = new MySource();
        Source decorator1 = new Decorator1(source);
        Source decorator2 = new Decorator2(decorator1);

        decorator2.methodBasic();
    }

}
