package utility;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

import connections.HttpConnection;

public class Utils {
	
	public static Map<Integer, String> daysOfWeekMap = new HashMap<Integer, String>();
	public static Map<Integer, String> monthMap = new HashMap<Integer, String>();
	
	static {
		daysOfWeekMap.put(1, "Lun");
		daysOfWeekMap.put(2, "Mar");
		daysOfWeekMap.put(3, "Mer");
		daysOfWeekMap.put(4, "Gio");
		daysOfWeekMap.put(5, "Ven");
		daysOfWeekMap.put(6, "Sab");
		daysOfWeekMap.put(7, "Dom");
		
		monthMap.put(0, "Gennaio");
		monthMap.put(1, "Febbraio");
		monthMap.put(2, "Marzo");
		monthMap.put(3, "Aprile");
		monthMap.put(4, "Maggio");
		monthMap.put(5, "Giugno");
		monthMap.put(6, "Luglio");
		monthMap.put(7, "Agosto");
		monthMap.put(8, "Settembre");
		monthMap.put(9, "Ottobre");
		monthMap.put(10, "Novembre");
		monthMap.put(11, "Dicembre");
	}
	
	public static BufferedReader automaticCreationHttpConnection(String url) throws Exception {
		HttpConnection httpConn = new HttpConnection(url);
		return httpConn.getBufferedReader();
	}
	
	
}
