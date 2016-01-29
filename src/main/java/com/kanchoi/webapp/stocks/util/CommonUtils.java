package com.kanchoi.webapp.stocks.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {

	public static Date stringToDatetime(String dt)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		
		String dateInString = dt;
	 
		try {
			Date date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));
			return date;
	 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}

