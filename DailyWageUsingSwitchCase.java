[24:16, 1/4/2021] Pratik Gharat: public class DailyWageUsingSwitch
{
	
	private static final int wage_per_hour=20;
	private static final int full_day_hour=8;
	private static final int half_day_hour=4;
    public static void main( String[] args )
    {    
    	double check_employee=Math.floor(Math.random()*10)%2;
    	double working_day=Math.floor(Math.random()*10)%2;
    	 switch((int)check_employee)
    	 {
    	 case 1:
                  System.out.println( "Employee is present");
                  switch((int)working_day)
                  {
                  case 1:
        	         System.out.println("Employee Working full day");
        	          int salary=wage_per_hour*full_day_hour;
        	           System.out.println("Employee daily Wage"+" " +salary);
        	           break;
                  case 0 :
                    	System.out.println("Employee Working half day");
        	            int salary1=wage_per_hour*half_day_hour;
        	             System.out.println("Employee daily Wage"+" "+ salary1);
        	             break;
        	       default:System.out.println("it is a case of default");     
                   }
                  break;
    	 case 0:
    		System.out.println("Employee is not present");
    		break;
    	    default : System.out.println("it is a case of default");
        }
     }
}
