package javaproject15;

public class example2 {

	public static void main(String[] args) {
		int employee_ids[] = {1234,5687,9807,2345,34762,};

		double employee_salaries[] = {47897.09, 98736.23,78396.89,34354.23,23345.90};


		for(int employee_id: employee_ids) 
		{ 
			System.out.println(employee_id); 
		}

		System.out.println("____________________________________");
		
		for(double employee_salary: employee_salaries)
		{
			System.out.println(employee_salary);
		}
	}
		

}
