package utility;

import java.io.BufferedReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import connections.HttpConnection;

public class Utils {
	
	public static Map<Integer, String> daysOfWeekMap = new HashMap<Integer, String>();
	public static Map<Integer, String> monthMap = new HashMap<Integer, String>();
	
	static {
		daysOfWeekMap.put(Calendar.MONDAY, "Lun");
		daysOfWeekMap.put(Calendar.TUESDAY, "Mar");
		daysOfWeekMap.put(Calendar.WEDNESDAY, "Mer");
		daysOfWeekMap.put(Calendar.THURSDAY, "Gio");
		daysOfWeekMap.put(Calendar.FRIDAY, "Ven");
		daysOfWeekMap.put(Calendar.SATURDAY, "Sab");
		daysOfWeekMap.put(Calendar.SUNDAY, "Dom");
		
		monthMap.put(Calendar.JANUARY, "Gennaio");
		monthMap.put(Calendar.FEBRUARY, "Febbraio");
		monthMap.put(Calendar.MARCH, "Marzo");
		monthMap.put(Calendar.APRIL, "Aprile");
		monthMap.put(Calendar.MAY, "Maggio");
		monthMap.put(Calendar.JUNE, "Giugno");
		monthMap.put(Calendar.JULY, "Luglio");
		monthMap.put(Calendar.AUGUST, "Agosto");
		monthMap.put(Calendar.SEPTEMBER, "Settembre");
		monthMap.put(Calendar.OCTOBER, "Ottobre");
		monthMap.put(Calendar.NOVEMBER, "Novembre");
		monthMap.put(Calendar.DECEMBER, "Dicembre");
	}
	
	public static BufferedReader automaticCreationHttpConnection(String url) throws Exception {
		HttpConnection httpConn = new HttpConnection(url);
		return httpConn.getBufferedReader();
	}
	
	
}
