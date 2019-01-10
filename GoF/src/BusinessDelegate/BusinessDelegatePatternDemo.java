/*
 * Desacopla a camada de aplicacao da invocacao 
 * de diferentes servicos, parece util mas cria muito 
 * codigo para gerenciar.
 * */

package BusinessDelegate;

public class BusinessDelegatePatternDemo {

	public static void main(String[] args) {
	
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		
		Client client = new Client(businessDelegate);
		client.doTask();
		
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}