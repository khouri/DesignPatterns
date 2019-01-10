/*
 * Esse patern evita criar objetos desnecessariamente so cria se 
 * nao existir circulo com aquela cor. Faz sentido quando ha 
 * muitos objetos pesados em memoria
 * 
 * */
package Flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String, Shape> circleMap = new	HashMap<String, Shape>();
	
	public static Shape getCircle(String color) {
	
		Circle circle = (Circle)circleMap.get(color);
		
		if(circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		
		return circle;
	}
	
}