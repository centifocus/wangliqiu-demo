package designPattern.adapter.adapter2;

/**
 * 借助于一个抽象类来实现接口的所有方法，我们写一个具体类来继承该抽象类，重写我们需要的方法就行。
 * TargetSub1，TargetSub2适配了接口（只实现了部分接口方法）。
 */
public class Test {

    public static void main(String[] args) {
        Target source1 = new TargetSub1();
        Target source2 = new TargetSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }

} 
