package com.topscit.spv.util;


	
	import java.io.InputStream;
	import java.net.HttpURLConnection;
	import java.net.URL;

	public class HttpUtil {
		
		public static String send(String url)
		{
			StringBuffer buffer = new StringBuffer();
			try {
				URL u = new URL(url);
				HttpURLConnection connection = (HttpURLConnection)u.openConnection();
				connection.setRequestMethod("POST");
				connection.setConnectTimeout(3000);
				connection.connect();
				int responseCode = connection.getResponseCode();
				if(responseCode == HttpURLConnection.HTTP_OK)
				{
					InputStream inputStream = connection.getInputStream();
					
					int len;
					byte[] content = new byte[1024];
					while((len = inputStream.read(content)) != -1)
					{
						buffer.append(new String(content,0,len));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return buffer.toString();
			
		}

	}


