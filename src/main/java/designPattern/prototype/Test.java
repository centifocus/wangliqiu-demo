package designPattern.prototype;

import java.io.IOException;

public class Test   {

   
    public static void main(String[] argStrings) throws CloneNotSupportedException, ClassNotFoundException, IOException {

		MyObject myObject = new MyObject();
		Prototype prototype = new Prototype(1, myObject);

		Prototype prototype2 = (Prototype) prototype.clone();
		System.out.println(prototype2.getBasicProp() == prototype.getBasicProp());
		System.out.println(prototype2.getMyObject() == prototype.getMyObject());
				
		Prototype prototype3 = (Prototype) prototype.deepClone();
		System.out.println(prototype3.getBasicProp() == prototype.getBasicProp());
		System.out.println(prototype3.getMyObject() == prototype.getMyObject());
	}
    
}
