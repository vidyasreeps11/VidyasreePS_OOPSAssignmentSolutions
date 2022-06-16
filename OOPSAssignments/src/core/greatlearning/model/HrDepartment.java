package core.greatlearning.model;

public class HrDepartment extends SuperDepartment{
	
	public HrDepartment() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Welcome to HR Department");
	}
	
	String departmentName()
	{
		return "HR Department";
	}

	public String getTodaysWork()
	{
		return "Fill today's worksheet and mark your attendance";
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String doActivity()
	{
		return "Team Lunch";
	}

}
