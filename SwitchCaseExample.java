
public class SwitchCaseExample {

	public static void main(String[] args) {
		int wage_per_hour = 20;
		int part_time_hour = 4;
		int full_day_hour = 8;
		int Employeewage = 0;
		int employeecheck = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("employeecheck" +employeecheck);
		  switch(employeecheck)
		{
		case 1:
			
				System.out.println("employee is present");

			break;
		
		case 2:
			//part time hours
			Employeewage =	part_time_hour * wage_per_hour;
			System.out.println("EMPLOYEE DAILY WAGES " +Employeewage);
		   break;
		
		case 3:		
			//full day hour
			Employeewage = full_day_hour * wage_per_hour;
			System.out.println("EMPLOYEE DAILY WAGES " +Employeewage);
		    break;
		default:
			System.out.println("employee is Abscent");
		}
		

}
}
