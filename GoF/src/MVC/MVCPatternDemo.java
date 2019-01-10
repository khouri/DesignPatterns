/*
 * Separa as responsabilidades de apresentacao,
 *  logica de negocio e acesso a dados.
 * 
 * */
package MVC;

public class MVCPatternDemo {
	
	public static void main(String[] args) {
		
		//fetch student record based on his roll no from the
		Student model = retriveStudentFromDatabase();
		
		//Create a view : to write student details on console
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model,	view);
		controller.updateView();
		
		//update model data
		controller.setStudentName("John");
		controller.updateView();
	}

	private static Student retriveStudentFromDatabase(){
		
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}