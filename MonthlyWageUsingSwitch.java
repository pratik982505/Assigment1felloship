public class MonthlyWageUsingSwitch
{
	
	private static final int wage_per_hour=20;
	private static final int full_day_hour=8;
	private static final int half_day_hour=4;
	public static int salary;
	public static int present;
    public static void main( String[] args )
    {    
    	for(int i=0;i<20;i++) { 
    	double check_employee=Math.floor(Math.random()*10)%2;
    	double working_day=Math.floor(Math.random()*10)%2;
    	switch((int)check_employee)
    	 {
    	 case 1:
                  present++;
                  switch((int)working_day)
                  {
                  case 1:
        	           salary=salary+(wage_per_hour*full_day_hour);
        	           break;
                  case 0 :
        	            salary=salary+(wage_per_hour*half_day_hour);
        	             break;
        	       default:System.out.println("it is a case of default");     
                   }
                  break;
    	 case 0:
    		salary=salary+0;
    		break;
    	    default : System.out.println("it is a case of default");
        }
     }
    	System.out.println("Number of days Employee present in a Months"+" "+present);
    	System.out.println("Calculating Wages for a Month"+" "+salary);
 }
}
