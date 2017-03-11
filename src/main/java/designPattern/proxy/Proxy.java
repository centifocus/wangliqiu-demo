package designPattern.proxy;

public class Proxy implements Source {

    private Source source;

    Proxy() {
        this.source = new MySource();
    }

    public void method() {
        source.method();
        anotherMethod();
    }

    private void anotherMethod() {
        System.out.println("another method!!!");
    }

}  
