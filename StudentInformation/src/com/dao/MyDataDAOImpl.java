package com.dao;
import com.model.HigherAuthorities;
import com.model.MyData;
import com.connection.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MyDataDAOImpl implements MyDataDAO {



   private static Connection con;
   static{
	   try{
		   con=MyConnection.getCon();
	   }catch(Exception e){e.printStackTrace();}
   }
   
   @Override
   public boolean addUser(MyData m){
	   String insertQuery = "insert into student values('"+m.getSystem_id()+"','"+m.getRoll_no()+"','"+m.getRole()+"','"+m.getName()+"','"+m.getCourse()+"','"+m.getBranch()+"','"+m.getSection()+"','"+m.getAddress()+"','"+m.getEmail()+"','"+m.getDate_of_birth()+"')";
	   String loginQuery = "insert into authentication values('" + m.getSystem_id() + "' , '" + m.getRoll_no() + "' ,'" + m.getRole() + "','"+ m.getName() +"','"+ m.getAddress() +"')";
	   try{
		   Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(insertQuery);
		   
		   Statement stmt2=con.createStatement();
		   int j=stmt2.executeUpdate(loginQuery);
		   
		   if(i==1 && j==1){
		   System.out.println("User is Registered with User ID : " + m.getSystem_id() + " and Name " +m.getName() );
		   return true;
		   }
	   }catch(Exception e){e.printStackTrace();}
	   return false;
   }
   
   @Override
   public boolean addAuthorities(HigherAuthorities ha) {
	   String insertQuery = "insert into authentication values('"+ha.getId()+"','"+ha.getPassword()+"','"+ha.getRole()+"','"+ha.getName()+"','"+ha.getAddress()+"')";	 
	   try{
		   Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(insertQuery);	   
		   if(i==1){
		   System.out.println("Higher Authority is Registered with User ID : " + ha.getId() + " and Name " +ha.getName() );
		   return true;
		   }
	   }catch(Exception e){e.printStackTrace();}
	   return false;
   }
/*   
  @Override
   public List<MyData> getAllData(){
	   List<MyData> list=new ArrayList<>();
	   String getQuery="Select * from mydata";
	   try{
		   PreparedStatement stmt=con.prepareStatement(getQuery);
		   ResultSet resultset=stmt.executeQuery();
		   while(resultset.next()){
			   MyData m=new MyData();
			   m.setRollno(resultset.getInt(1));;
			   m.setFirstname(resultset.getString(2));
			   m.setLastname(resultset.getString(3));
			   m.setAddress(resultset.getString(4));
			   m.setEmail(resultset.getString(5));
			   list.add(m);
		   }
	   }catch(Exception e){e.printStackTrace();}
	   System.out.println(list);
		   return list;
   }
   
   @Override
   public boolean deleteData(int rollno){
	   String deleteQuery="delete from mydata where Rollno="+rollno;
	   try{
	       Statement stmt=con.createStatement();
		   int i=stmt.executeUpdate(deleteQuery);
		   if(i==1){
			   System.out.println("Data is Deleted Whose Rollno Is"+rollno);
		  }
	  }catch(Exception e){e.printStackTrace();}
	   return false;
   }
   
   @Override
   public boolean deleteAllData(){
   String deleteQuery="delete from mydata";
   try{
	   Statement stmt=con.createStatement();
		  int i=stmt.executeUpdate(deleteQuery);
		  if(i==1){
			  System.out.println("ALl the data is deleted");
			  return true;
		  }
          }catch(Exception e){e.printStackTrace();}
   return false;
   }*/

}