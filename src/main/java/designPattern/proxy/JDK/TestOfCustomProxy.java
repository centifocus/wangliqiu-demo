package designPattern.proxy.JDK;

public class TestOfCustomProxy {


    public static void main(String[] args) {
        CustomProxy proxy = new CustomProxy();


        Source source = new MySource("man1");
        System.err.println(source);
        // 这时man1 为代理对象
        Source sourceProxy = (Source) proxy.bind1(source);
        System.err.println(sourceProxy);// 和原Man对象打印相同？ 因为代理类生成了toString()，内部引用的就是Man的toString()
        sourceProxy.method();

//        Source man2 = new MySource("man2");
//        // 这时man2 为代理对象
//        man2 = (Source) proxy.bind2(man2);
//        man2.method();

    }

}
