package designPattern.decorator;

public class Decorator2 implements Source {

    private Source source;

    Decorator2(Source source) {
        this.source = source;
    }

    public void methodBasic() {
        source.methodBasic();
        System.out.println("expand2 method");  //do something
    }

    public void methodAnother2() {
        System.out.println("methodAnother2");
    }

}
