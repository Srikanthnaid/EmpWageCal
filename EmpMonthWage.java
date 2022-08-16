
public class EmpMonthWage {

	public static void main(String[] args) {
		int wage_per_hour = 20;
		int part_time_hour = 4;
		int full_day_hour = 8;
		int Employeewage = 0;
		int total_working_days = 20;
		int total_hour1 = 0;
		int total_hour2 = 0;
		int total_wages = 0;
		int empcheck = (int) Math.floor(Math.random() * 10) % 2;
		System.out.println("empcheck " +empcheck);
		
		switch(empcheck)
		{
		case 1:
		//pat time 
		total_hour1 = part_time_hour * total_working_days;
		System.out.println("monthly working hours  "  +total_hour1);
		
		//full day
		
		total_hour2 = full_day_hour * total_working_days;
		System.out.println("monthly working hours " +total_hour2);
	
		//employee total wages for total working days in month
	    
		total_wages = (total_hour1 + total_hour2)* wage_per_hour;
		System.out.println("monthly employee wages " +total_wages);
		break;
		default:
			System.out.println("employee is Abscent");
			
		}
			
			
	
		
			
		
			
	}

}
