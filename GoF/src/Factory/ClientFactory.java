package Factory;

public class ClientFactory {
	
	/*Aplicacao Cliente*/
	public static void main(String[] args) {
				
		try {
			IShape circulo = new FactoryShape().instanciateShape(EnumShapeTypes.CIRCLE);
			circulo.draw();
			
			IShape rectangle = new FactoryShape().instanciateShape(EnumShapeTypes.RECTANGLE);
			rectangle.draw();

			IShape square = new FactoryShape().instanciateShape(EnumShapeTypes.SQUARE);
			square.draw();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
