package Extent_Reports;

import java.util.Date;

public class Time {
	public static void main(String[] args) {
		
		String time=new Date().toString().replace(" ", "_").replace(":", "_");
		
		System.out.println(time);
		
	}

}
