package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Set response content type
	      resp.setContentType("text/html");
	 
	      // Get current time - by www.yiibai.com
	      Calendar calendar = new GregorianCalendar();
	      
	      int year = calendar.get(Calendar.YEAR);
	      int month = calendar.get(Calendar.MONTH);
	      int day = calendar.get(Calendar.DAY_OF_MONTH);
	      int hour = calendar.get(Calendar.HOUR);
	      int minute = calendar.get(Calendar.MINUTE);
	      int second = calendar.get(Calendar.SECOND);
	      
	      int days = calendar.get(Calendar.DAY_OF_YEAR);
	 
	      int weeks = days / 7;
	      String CT = "��ǰʱ�䣺"+year+"��"+month+"��"+day+"��"+"  "+hour+"��"+ minute +"��"+ second +" ��";
	      String WT = "������"+year+"��"+"�ĵ�"+weeks+"��";
	      PrintWriter out = resp.getWriter();
	      String docType =
	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
	      "transitional//en\">\n";
	      out.println(docType +
	        "<html>\n" +
	        "<head><meta charset=\"UTF-8\"><title></title></head>\n"+
	        "<body>\n" +
	        "<h1 align=\"center\"></h1>\n" +
	        "<p>"+ CT + "</p>\n"+
	        "<p>"+ WT + "</p>\n");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
	
	
}
