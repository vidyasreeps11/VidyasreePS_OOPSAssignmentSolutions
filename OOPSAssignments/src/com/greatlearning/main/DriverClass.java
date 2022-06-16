package com.greatlearning.main;
import core.greatlearning.model.AdminDepartment;
import core.greatlearning.model.HrDepartment;
import core.greatlearning.model.TechDepartment;


public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment admin_obj=new AdminDepartment();
		
		System.out.println(admin_obj.getTodaysWork());
		System.out.println(admin_obj.getWorkDeadline());
		System.out.println(admin_obj.isTodayAHoliday()+"\n");
		
		HrDepartment hr_obj=new HrDepartment();
		
		System.out.println(hr_obj.doActivity());
		System.out.println(hr_obj.getTodaysWork());
		System.out.println(hr_obj.getWorkDeadline());
		System.out.println(hr_obj.isTodayAHoliday()+"\n");
		
		TechDepartment tech_obj=new TechDepartment();
		
		System.out.println(tech_obj.getTodaysWork());
		System.out.println(tech_obj.getWorkDeadline());
		System.out.println(tech_obj.getTechStackInformation());
		System.out.println(tech_obj.isTodayAHoliday()+"\n");
	}

}
