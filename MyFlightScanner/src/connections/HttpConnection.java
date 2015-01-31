package connections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

public class HttpConnection {
	
	private Proxy proxy;
	private BufferedReader buffReader;
	
	
	public HttpConnection(String url) throws Exception {
		super();
		initialize(url);
	}
	
	
	public HttpConnection(String ipProxyAddr, int proxyPort, String url) throws Exception {
		super();
		setProxy(ipProxyAddr, proxyPort);
		initialize(url);
	}

	
	public void setProxy(String ipAddr, int port) {
		this.proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ipAddr, port));
	}
	
	
	public BufferedReader getBufferedReader() {
		return this.buffReader;
	}
	
	
	public void initialize(String url) throws Exception {
		
		URL urlConn;
		HttpURLConnection connection = null;
		
		try {
			urlConn = new URL(url);
			connection = (HttpURLConnection) ((proxy != null) ? urlConn.openConnection(proxy) : urlConn.openConnection());
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new MalformedURLException("The connection cannot be established (Malformed URL):\n" + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new Exception("The connection cannot be established (I/O Exception):\n" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("The connection cannot be established (Generic Exception):\n" + e.getMessage());
		}
		
		buffReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	}
	
}
