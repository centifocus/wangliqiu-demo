package designPattern.decorator;

public class Decorator1 implements Source {

    private Source source;

    Decorator1(Source source) {
        this.source = source;
    }

    public void methodBasic() {
        source.methodBasic();
        System.out.println("expand1 method");  //do something
    }

    public void methodAnother1() {
        System.out.println("methodAnother1");
    }

} 
