package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	      resp.setContentType("text/html");
	      resp.setCharacterEncoding("UTF-8");
	      Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+8"));
	      
	      int year = calendar.get(Calendar.YEAR);
	      int month = calendar.get(Calendar.MONTH) + 1;
	      int day = calendar.get(Calendar.DAY_OF_MONTH);
	      int hour = calendar.get(Calendar.HOUR_OF_DAY);
	      int minute = calendar.get(Calendar.MINUTE);
	      int second = calendar.get(Calendar.SECOND);
	      
	      int days = calendar.get(Calendar.DAY_OF_YEAR);
	 
	      int weeks = 0;
	      if(days % 7 == 0)
	      {
	    	  weeks = days / 7;
	      }
	      else 
	      {
	    	  weeks = days / 7 + 1;
	      }
	    	  
	      String CT = "当前时间："+year+"年"+month+"月"+day+"日"+"  "+hour+"点"+ minute +"分"+ second +" 秒";
	      String WT = "今天是"+year+"年"+"的第"+weeks+"周";
	      PrintWriter out = resp.getWriter();
	      String docType =
	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
	      "transitional//en\">\n";
	      out.println(docType +
	        "<html>\n" +
	        "<head><meta charset=UTF-8><title></title></head>\n"+
	        "<body>\n" +
	        "<p>"+ CT + "</p>\n"+
	        "<p>"+ WT + "</p>\n");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
	
	
}
