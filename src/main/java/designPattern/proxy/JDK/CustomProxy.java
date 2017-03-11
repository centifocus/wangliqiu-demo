package designPattern.proxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class CustomProxy implements InvocationHandler {

    private Object target;

    /**
     * @param target target必须要有接口
     */
    Object bind1(Object target) {
        this.target = target;

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), target.getClass().getInterfaces(), this
        );
    }

    /**
     * bind1的具体实现
     */
    Object bind2(Object target) throws Exception {
        this.target = target;

        Class<?> proxyClass =
                Proxy.getProxyClass(target.getClass().getClassLoader(), target.getClass().getInterfaces());
        return proxyClass.getConstructor(InvocationHandler.class).newInstance(this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        if (method.getName().equals("toString")) {
//
//            return method.invoke(target, args);
//        }
        System.err.println("proxy: " + proxy);


        Object result = method.invoke(target, args);


        return result;
    }
}
