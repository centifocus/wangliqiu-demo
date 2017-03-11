package designPattern.proxy.JDK;

public class TestOfCustomProxy {


    public static void main(String[] args) {
        CustomProxy proxy = new CustomProxy();

        Source source = new MySource("prop");
        System.err.println(source);
        Source sourceProxy = (Source) proxy.bind1(source);
        System.err.println(sourceProxy);
        sourceProxy.method();

    }

}
