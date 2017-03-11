package designPattern.observer;

/**
 * 
 *
 * @param <T>
 *            事件类型
 */
public interface Observable<T> {

	/* 订阅事件 */
	public void subscribe(Observer<T> observer);

	/* 通知所有的观察者 */
	public void notifyObservers(T event);

}
