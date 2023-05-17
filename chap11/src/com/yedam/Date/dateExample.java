package com.yedam.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");

		System.out.println(sdf.format(date));
	
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH+1);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = "";
		switch (week) {
		case 1: 
			strWeek = "일";
			break;
		case 2: 
			strWeek = "월";
			break;
		case 3: 
			strWeek = "화";
			break;
		case 4: 
			strWeek = "수";
			break;
		case 5: 
			strWeek = "목";
			break;
		case 6: 
			strWeek = "금";
			break;
		case 7: 
			strWeek = "토";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAMPM = null;
		if(amPm == Calendar.AM) {
			strAMPM = "오전";
		}else {
			strAMPM = "오후";
		}
	
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년 ");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(strWeek + "요일");
		System.out.println(strAMPM + "");
		System.out.println(minute + "분");
		System.out.println(second + "초");
	
	}
}
