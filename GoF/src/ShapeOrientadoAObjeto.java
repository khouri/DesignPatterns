/* Abordagem Orientado a Objeto vc tem varias classes que sabem se alterar
 * elas contem os dados e os metodos para se alterar, nao precisa de uma
 * classe Geometry para altera-las
 * 
 * Aqui adicionar novos dados ou comportamentos eh simples basta 
 * implementar uma nova classe Triangulo
 * 
 * Tem como desvantagem se precisar implementar uma nova funcionalidade
 * vc eh obrigado a alterar todas as classes.
 * 
 * Tenta implementar Triangulo
 * 
 * Tenta adiconar imprimeLado
 * 
 * Deduza qual eh mais complicada 
 * */
public class ShapeOrientadoAObjeto {

}

interface Shape {
	
	public double area();
}

class SquareOO implements Shape {
	
	private double side;
	
	public double area() {
		return side * side;
	}
}
class RectangleOO implements Shape {
	
	private double height;
	private double width;
	
	public double area() {		
		return height * width;
	}
}
class CircleOO implements Shape {
	
	private double radius;
	public final double PI = 3.141592653589793;
	
	public double area() {
		return PI * radius * radius;
	}
}