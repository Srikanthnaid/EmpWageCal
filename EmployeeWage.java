
public class EmployeeWage {

	public static void main(String[] args) {
		
		int wage_per_hour = 20;
		int full_day_hour = 8;
		int Employeewage = 0;
		int employeecheck = (int) Math.floor(Math.random() * 10) % 2;
		if (employeecheck == 1) {
			
		
			System.out.println("Employee is present");
		    Employeewage = full_day_hour * wage_per_hour;
		
		    System.out.println("CALCULATE DAILY EMPLOYEE WAGE  "   +Employeewage);
		}
		  else
		  {
			System.out.println("employee is abscent");
		}
	}

}
