/*
 * Implementa um abstract Factory para aprender, muito util 
 * para instanciar objetos escondendo a complexidade de new
 * 
 * */
package AbstractFactory;

public abstract class AbstractFactory {
	
	abstract IColor getColor(String color);
	abstract IShape getShape(String shape) ;
}