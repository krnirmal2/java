import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;

public class RunCollege {
	public static void main(String[] args) {
		Student s= new Student("Nirmal",'m',10,4.5f);
		
		String subject[]= {"math","physics"};
		Professor p = new Professor("mehul",'m',subject);
		
//		System.out.println(s.name);
//		System.out.println(s.gender);
//		
//		System.out.println(p.name);
//		System.out.println(p.gender);
//		
		
		System.out.println(s);
		
//		System.out.println(s.toString());
		//internally
		//
//		System.out.println(Student.toString(s));
		
		

		
//		System.out.println(s.getDetails());
//		System.out.println(p.getDetails());
//		
		//
	}

}
