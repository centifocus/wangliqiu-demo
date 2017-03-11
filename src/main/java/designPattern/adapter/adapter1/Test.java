package designPattern.adapter.adapter1;

/**
 * 对象的适配器模式
 *
 */
public class Test {  
	
    public static void main(String[] args) {  
        Source source = new Source();  
        Target  target = new Wrapper(source);
        target.methodNew();
        target.methodOld();
    }  
    
} 
