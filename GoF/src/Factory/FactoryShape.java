package Factory;

/*
 * Padrao Creacional tem como objetivo esconder a instanciacao de classes
 * desacopla classes e permite um gerenciamento eficiente.
 * */
public class FactoryShape {

	public IShape instanciateShape(EnumShapeTypes shapeType) throws Exception{		

		switch (shapeType) {
		
			case CIRCLE:
				return new Circle();
	
			case RECTANGLE:
				return new Rectangle();
	
			case SQUARE:
				return new Square();
	
			default:
				throw new Exception("Tipo não reconhecido pela fábrica");
		}
	}
}