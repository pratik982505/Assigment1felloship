public class DailyWage
{
	private static final int is_present=1;
	private static final int wage_per_hour=20;
	private static final int full_day_hour=8;
	private static final int half_day_hour=4;
    public static void main( String[] args )
    {    
    	double check_employee=Math.floor(Math.random()*10)%2;
    	double working_day=Math.floor(Math.random()*10)%2;
    	if(check_employee==is_present) {
        System.out.println( "Employee is present");
        if(working_day==1) {
        	System.out.println("Employee Working full day");
        	int salary=wage_per_hour*full_day_hour;
        	System.out.println("Employee daily Wage"+" " +salary);
        }
        else {
        	System.out.println("Employee Working half day");
        	int salary1=wage_per_hour*half_day_hour;
        	System.out.println("Employee daily Wage"+" "+ salary1);
              }
    	}
        
    	else
    		System.out.println("Employee is not present");
    }
}
