
public class GenericClassMethods {
	
	public class StudentDAO {
	    public void save(Student student) {
	        // code to save student details to database
	    }
	 
	    public Student get(long id) {
	        // code to get student details from database...
	        // ...and return a Student object
	    }
    }
 
	 public class ProfessorDAO {
	    public void save(Professor professor) {
	        // code to save professor details to database
	    }
	 
	    public Professor get(long id) {
	        // code to get professor details from database...
	        // ...and return a Professor object
	    }
    }


    public class GeneralDAO<T> {
 
	    public void save(T entity) {
	        // code to save entity details to database
	    }
	 
	    public T get(long id) {
	        // code to get details from database...
	        // ...and return a T object
	    }
    }
	public static void main(String[] args){
		
		GeneralDAO<Student> studentDAO = new GeneralDAO<Student>();
 
		Student newStudent = new Student();
		studentDAO.save(newStudent);
		 
		Student oldStudent = studentDAO.get(250);


		GeneralDAO<Professor> professorDAO = new GeneralDAO<Professor>();
 
		Professor newProfessor = new Professor();
		professorDAO.save(newProfessor);
		 
		Professor oldProfessor = professorDAO.get(100);
		
	}	
}