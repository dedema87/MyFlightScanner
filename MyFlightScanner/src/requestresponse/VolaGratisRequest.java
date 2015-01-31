package requestresponse;

import java.util.Calendar;

import utility.Utils;

public class VolaGratisRequest {
	
public static String urlDepartureAndArrivalAR(String departureAirportCode, String arrivalAirportCode, Calendar from, Calendar to, int people) {
		
		StringBuilder ret = new StringBuilder("http://www.volagratis.com/vg1/searching.do?");
		
		ret.append("departureAirport=");
		ret.append(departureAirportCode);
		ret.append("&arrivalAirport=");
		ret.append(arrivalAirportCode);
		ret.append("&outboundDayMonthYear=");
		ret.append(Utils.daysOfWeekMap.get(from.get(Calendar.DAY_OF_WEEK)));
		ret.append("+");
		ret.append(from.get(Calendar.DAY_OF_MONTH));
		ret.append("+");
		ret.append(Utils.monthMap.get(from.get(Calendar.MONTH)));
		ret.append("+");
		ret.append(from.get(Calendar.YEAR));
		ret.append("&returnDayMonthYear=");
		ret.append(Utils.daysOfWeekMap.get(to.get(Calendar.DAY_OF_WEEK)));
		ret.append("+");
		ret.append(to.get(Calendar.DAY_OF_MONTH));
		ret.append("+");
		ret.append(Utils.monthMap.get(to.get(Calendar.MONTH)));
		ret.append("+");
		ret.append(to.get(Calendar.YEAR));
		ret.append("&adults=");
		ret.append(people);
		ret.append("&infants=0&SPM=-1&classFlight=&roundtrip=true&search1_airports_hidden=&search1_focusctrl=&search1_keywords=&search2_airports_hidden=&search2_focuctrl=&search2_keywords=&filter1=TXT&filter1=TXT&bf_subsource=S02HPF10S02RR11&routeFilter=&url=search3.do");
		ret.append("&outboundDay=");
		if (from.get(Calendar.DAY_OF_MONTH) < 10)	ret.append(0);
		ret.append(from.get(Calendar.DAY_OF_MONTH));
		ret.append("&outboundMonthYear=");
		if (from.get(Calendar.MONTH)+1 < 10) ret.append(0);
		ret.append(from.get(Calendar.MONTH)+1);
		ret.append(from.get(Calendar.YEAR));
		ret.append("&returnDay=");
		if (to.get(Calendar.DAY_OF_MONTH) < 10)	ret.append(0);
		ret.append(to.get(Calendar.DAY_OF_MONTH));
		ret.append("&returnMonthYear=");
		if (to.get(Calendar.MONTH)+1 < 10) ret.append(0);
		ret.append(to.get(Calendar.MONTH)+1);
		ret.append(to.get(Calendar.YEAR));
		
		return ret.toString();
	}

}
