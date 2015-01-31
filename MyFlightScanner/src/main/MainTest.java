package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;

import requestresponse.VolaGratisRequest;
import utility.Utils;

public class MainTest {
	
	public static void main(String[] args) {
		
		int people = 1;
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		
		from.set(2015, Calendar.APRIL, 30, 12, 0);
		to.set(2015, Calendar.MAY, 4, 12, 0);
		
		String url = VolaGratisRequest.urlDepartureAndArrivalAR("ROM", "FRA", from, to, people);
		BufferedReader buffer;
		String line;
		String newLine = "\n";
		StringBuilder htmlBuff = new StringBuilder();
		
		System.out.println(url);
		
		try {
			
			buffer = Utils.automaticCreationHttpConnection(url);
			while ((line = buffer.readLine()) != null) {
				htmlBuff.append(line);
				htmlBuff.append(newLine);
			}
			
			System.out.println("*** HTML PARSER ***");
			System.out.println(htmlBuff.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
		
		
	}

}
