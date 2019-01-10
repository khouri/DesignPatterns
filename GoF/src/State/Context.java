/*
 * Troca de comportamento conforme troca de contexto,
 * vc pode mudar o comportamento de uma classe em tempo de 
 * execucao.
 * */

package State;

public class Context {
	
	private State state;

	public Context(){
		state = null;
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getState(){
		return state;
	}
}