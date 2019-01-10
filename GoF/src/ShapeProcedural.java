/* A abordagem procedural vc tem varios dados (Square, Rectangle e Circle)
 * que sao alterados por uma classe gerenciadora, Geometry, ha uma 
 * separacao entre estrutura de dados e funcoes.
 * 
 * Essa abordagem tem como vantagem facilitar adicionar novas funcoes
 * vc so precisa alterar a classe gerenciadora, nao muda as estruturas 
 * de dados existentes.
 * 
 * Ela torna complicado adicionar novos tipos de dados (estruturas)
 * pois vc seria obrigado a mudar todas as funcoes.
 * 
 * Tenta adicionar o metodo imprimir, altera apenas uma classe
 * Tenta adicionar o triangulo, altera todos os metodos da 
 * classe geometry
 * */
public class ShapeProcedural {

	public static void main(String[] args) {		
		
		Square square = new Square();
		square.side = 10;
		
		Rectangle rectangle = new Rectangle();
		rectangle.height = 2;
		rectangle.width = 10;
		
		Circle circle = new Circle();
		circle.radius = 3;
		
		Geometry geometry = new Geometry();
		try {
			double areaQuadrado = geometry.area(square);
			double areaRectangle = geometry.area(rectangle);
			double areaCircle = geometry.area(circle);

			System.out.println("Area eh: "+areaQuadrado);
			System.out.println("Area eh: "+areaRectangle);
			System.out.println("Area eh: "+areaCircle);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class Square {
	public double side;
}

class Rectangle {
	public double height;
	public double width;
}

class Circle {
	public double radius;
}

class Geometry {

	public final double PI = 3.141592653589793;

	public double area(Object shape) throws Exception {

		if (shape instanceof Square) {
			Square s = (Square)shape;
			return s.side * s.side;
		}
		else if (shape instanceof Rectangle) {
			Rectangle r = (Rectangle)shape;
			return r.height * r.width;
		}
		else if (shape instanceof Circle) {
			Circle c = (Circle)shape;
			return PI * c.radius * c.radius;
		}
		throw new Exception();
	}
}