/* Forca a existir apenas um objeto highlander da classe
 * eh do tipo creacional
 * */
package Singleton;

public class SingleObject {
	
	//create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	//make the constructor private so that this class cannot be
	//instantiated
	private SingleObject(){}

	//Get the only object available
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Im imortal uahahahahah!");
	}
}
