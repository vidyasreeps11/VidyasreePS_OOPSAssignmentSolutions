package core.greatlearning.model;

public class TechDepartment  extends SuperDepartment{

	public TechDepartment() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Welcome to Tech Department");
	}
	
	String departmentName()
	{
		return "Tech Department";
	}

	public String getTodaysWork()
	{
		return "Complete coding of module 1	";
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String getTechStackInformation()
	{
		return "Core Java";
	}
}
