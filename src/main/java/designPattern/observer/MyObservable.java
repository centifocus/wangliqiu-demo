package designPattern.observer;

public class MyObservable extends AbstractObservable<Event> {

	public void otherMethod() {
		System.out.println("业务逻辑 do something");

	}

}
