package client_http;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PracticeHttp {
	
	class SendThread1 extends Thread{
		String on;
		String off; 
		
		String urlstr = "http://192.168.0.7/iot1.mc";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;
		
		public SendThread1(String on, String off) {
			this.on = on;
			this.off = off;
		}
		@Override
		public void run() {
			try {
				url = new URL(urlstr + "?on"+on+"&off="+off);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
