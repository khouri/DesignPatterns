/*
 * Cria uma camada de abstracao que esconde os detalhes 
 * de implementacao de outras partes do sistema.
 * 
 * */
package Facade;

public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawSquare(){
		square.draw();
	}
}