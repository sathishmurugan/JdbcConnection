package com.sathish.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sathish.model.Student;
import com.sathish.util.ConnectionUtil;

public class StudentDAO {
public void save(Student student)
{
try {
	Connection con=ConnectionUtil.getConnection();
	String sql = "insert into data (name,email,password) value ( ?, ? ,? )";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, student.getName());
    pst.setString(2, student.getEmail());
    pst.setString(3, student.getPassword());
    int rows = pst.executeUpdate();
    System.out.println("No of rows inserted: " + rows);
} catch (Exception e) {
	System.out.println("connt inserted");
}	
}
}
