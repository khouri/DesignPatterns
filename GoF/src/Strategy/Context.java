/*
 * Executa o mesmo metodo com diferentes implementacoes de acordo 
 * com o contexto permite modificar o comportamento de uma classe 
 * em tempo de execucao.
 * 
 * */

package Strategy;

public class Context {
	
	private Strategy strategy;

	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
}