package designPattern.adapter.adapter1;

public class Wrapper implements Target {
    //内部托管类
    private Source source;

    Wrapper(Source source) {
        this.source = source;
    }

    public void methodNew() {
        System.out.println("Target method");
    }

    public void methodOld() {
        source.method();
    }

} 
