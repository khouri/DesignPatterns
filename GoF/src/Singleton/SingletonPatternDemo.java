package Singleton;


public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		/*Imposivel instanciar o objeto 
		 * pois o construtor eh private
		 * tem que pegar a instancia highlander
		 * */
		SingleObject object = SingleObject.getInstance();

		object.showMessage();
	}
}
