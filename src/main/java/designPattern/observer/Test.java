package designPattern.observer;

/**
 * 事件驱动（观察者模式）
 *
 */
public class Test {

	public static void main(String[] args) {
		Observable<Event> observable = new MyObservable();
		Event event = new MyEvent("this is myevent!!!");

		observable.subscribe(new Observer<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println(this.getClass() + " : " + event);
			}
		});

		observable.notifyObservers(event);
	}

}
