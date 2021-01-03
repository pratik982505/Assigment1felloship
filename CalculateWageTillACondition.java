public class CalculateWageTillACondition
{
	
	private static final int wage_per_hour=20;
	private static final int full_day_hour=8;
	private static final int half_day_hour=4;
	public static int salary;
	public static int present_day;
	public static int total_hour;
    public static void main( String[] args )
    {    
    	while(present_day<20 && total_hour<100 ) { 
    	double check_employee=Math.floor(Math.random()*10)%2;
    	double type_of_working_day=Math.floor(Math.random()*10)%2;
    	switch((int)check_employee)
    	 {
    	 case 1:
                  present_day++;
                  switch((int)type_of_working_day)
                  {
                  case 1:
                	   total_hour=total_hour+full_day_hour;
        	           salary=salary+(wage_per_hour*full_day_hour);
        	           break;
                  case 0 :
                	    total_hour=total_hour+half_day_hour;
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
    	System.out.println("Number of days Employee present in a Months"+" "+present_day);
    	System.out.println("Number of hours Employee present in a Months"+" "+total_hour);
        System.out.println("Calculating Wages for a Month"+" "+salary);
 }
}
