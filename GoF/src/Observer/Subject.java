/*
 * Relacao de 1 para n entre objetos, se um objeto muda todos os outros
 * devem ser notificados.
 * */

package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
}