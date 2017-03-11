package designPattern.singleton;

public class Singleton {

    private Singleton() {

    }

    //饿汉式单例类//在类初始化时，已经自行实例化//缺点是无法完成延迟加载
    //  private static Singleton instance = new Singleton();
    //	public static Singleton getInstance(){
    //      return instance;
    //  }

    //必须synchronized，以防在多线程时被重复实例//缺点是多线程性能差
    //	private static Singleton ts1=null;
    //	public static synchronized Singleton getTest(){
    //      if(ts1==null){
    //        	ts1=new Singleton();
    //	    }
    //	    return ts1;
    //	}

    //JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
    private static class SingletonHolder {//通过静态内部类来托管单例
        private static Singleton instance = new Singleton();
    }

    //不调用getInstance()就不会加载静态类SingletonHolder
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

}
