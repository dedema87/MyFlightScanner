package utility;

import java.io.BufferedReader;

import connections.HttpConnection;

public class Utils {
	
	public static BufferedReader automaticCreationHttpConnection(String url) throws Exception {
		HttpConnection httpConn = new HttpConnection(url);
		return httpConn.getBufferedReader();
	}

}
