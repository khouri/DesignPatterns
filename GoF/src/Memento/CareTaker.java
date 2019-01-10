/*
 * Guarda uma lista de alteracoes do estado dos objetos 
 * dessa forma, eh possível gravar um log com eficiencia
 * mas custo de memoria elevado
 * 
 * */

package Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento state){
		mementoList.add(state);
	}
	
	public Memento get(int index){
		return mementoList.get(index);
	}
}