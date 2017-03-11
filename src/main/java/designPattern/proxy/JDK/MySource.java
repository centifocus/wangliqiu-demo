package designPattern.proxy.JDK;

public class MySource implements Source {

    private String prop;

    MySource(String prop){
        this.prop=prop;
    }

    public void method() {
        System.out.println(prop);
    }


    public String toString() {
        return "toString";
    }
} 
