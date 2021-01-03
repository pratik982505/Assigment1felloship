public class CheckEmployee
{
	private static final int is_present=1;
    public static void main( String[] args )
    {    
    	double check_employee=Math.floor(Math.random()*10)%2;
    	if(check_employee==is_present)
        System.out.println( "Employee is present");
    	else
    		System.out.println("Employee is not present");
    }
}
