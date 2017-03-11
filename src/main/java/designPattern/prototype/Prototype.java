package designPattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 当实例化一个对象的过程比较复杂时，克隆其实例会更加便捷。
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;

    private int basicProp;
    private MyObject myObject;

    Prototype(int basicProp, MyObject myObject) {
        this.basicProp = basicProp;
        this.myObject = myObject;
    }

    int getBasicProp() {
        return basicProp;
    }


    MyObject getMyObject() {
        return myObject;
    }


    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* 深复制 */
    Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
  
        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


}

class MyObject implements Serializable {
    private static final long serialVersionUID = 1L;
} 
