package designPattern.proxy;

/**
 * 代理模式对于客户来说是直接调用Proxy，屏蔽了Source。
 *
 */
public class Test {  
	  
    public static void main(String[] args) {  
        Source source = new Proxy();
        source.method();  
    }  
  
}  
