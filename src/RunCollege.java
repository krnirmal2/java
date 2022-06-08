import com.abc.salary.SalaryCalculator;
import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;

public class RunCollege {
	public static void main(String[] args) {
		Student s= new Student("Nirmal",'m',10,4.5f);
		
		String subject[]= {"math","physics"};
		Professor p = new Professor("mehul",'m',subject,500,13);
		
		System.out.println(SalaryCalculator.calculate(p));// this is need when we had SalaryCalulator class
		//but we can optimise by use default keyword inside SalaridIndividual file
		// of calculate method and also we don't need to pass the interface of SalariedIndividual
		// calculate method we can directly call using object of professor object
		System.out.println(p.calculate());
		
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
