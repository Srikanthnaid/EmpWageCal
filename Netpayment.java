package uc6;

public class Netpayment {

	public static void main(String[] args) {
		int wage_per_hour = 20;
		int part_time_hour = 4;
		int full_day_hour = 8;
		int total_hour = 0;
		int total_working_days = 0;
		int netpayment = 0;
		while (total_hour < 100 && total_working_days < 20)
		{
			int empcheck = (int) Math.floor(Math.random()*10)%2;
			total_working_days++;
			switch (empcheck)
			{
			case 1:
				total_hour = total_hour +full_day_hour;
				netpayment= netpayment + full_day_hour * wage_per_hour;
				System.out.println("employee is present fuii tim: " +netpayment);
				break;
			case 2:
				total_hour = total_hour + part_time_hour;
				netpayment = netpayment + part_time_hour;
				System.out.println("employee is half time present: " +netpayment);
				break;
			default:
				System.out.println("employee is abscent");
			}
			System.out.println("working days is : " +total_working_days + "hours : " +total_hour);
		}
		System.out.println("employee netpayment is : "+netpayment);
	}

}
