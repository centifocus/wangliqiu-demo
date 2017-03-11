package designPattern.observer;

import java.util.Collection;
import java.util.LinkedList;

public abstract class AbstractObservable<T> implements Observable<T> {

	private Collection<Observer<T>> coll = new LinkedList<>(); // 观察者集合

	@Override
	public void subscribe(Observer<T> observer) {
		coll.add(observer);
	}

	public void notifyObservers(T event) {
		for (Observer<T> observer : coll) {
			observer.handle(event);
		}
	}
}
