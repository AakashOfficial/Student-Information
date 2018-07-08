package com.dao;

import com.model.HigherAuthorities;
import com.model.MyData;
//import java.util.List;

public interface MyDataDAO {

  public boolean addUser(MyData m);
  public boolean addAuthorities(HigherAuthorities ha);
  //public List<MyData> getAllData();
  //public boolean deleteData(int rollno);
  //public boolean deleteAllData();
  //public boolean updateData(int rollno,String firstname);
  //public MyData findData(int rollno);
}