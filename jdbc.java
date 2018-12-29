package org.preek.com;
import java.sql.*;
import java.util.Scanner;

public class jdbc {

	public void jdbc_con() 
	{
	
       Connection con=null;
       PreparedStatement pstmt=null;
       ResultSet rs=null;
       String qry="select * from soudest.sod";
       try
       {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=dinga");
    	   pstmt=con.prepareStatement(qry);
    	   rs=pstmt.executeQuery();
    	   while(rs.next())
    	   {
    		   String s=rs.getString("source");
    		   String d=rs.getString("destination");
    		   String a=rs.getString("airline");
    		   System.out.println(s+" "+d+" "+a);
    		   
    		   
    		   
    	   }
    	   
       }
		
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
       finally
       {
    	   if(rs!=null)
    	   {
    		   try
    		   {
    			   rs.close();
    		   }
    		   catch(SQLException e)
    		   {
    			   e.printStackTrace();
    		   }
    	   }
    	   if(pstmt!=null)
    	   {
    		   try
    		   {
    			   pstmt.close();
    		   }
    		   catch(SQLException e)
    		   {
    			   e.printStackTrace();
    		   }
    	   }
    	   if(con!=null)
    	   {
    		   try
    		   {
    			   con.close();
    		   }
    		   catch(SQLException e)
    		   {
    			   e.printStackTrace();
    		   }
    	   }
       }
		
	}}

