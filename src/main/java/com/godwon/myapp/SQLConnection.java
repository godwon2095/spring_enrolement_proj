package com.godwon.myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	//JDBC를 사용하기 위한 변수 선언.
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:59161:xe";
	//DB 접속 아이디, 비밀번호.
	private static final String USER = "sys"; //아이디
	private static final String PASS = "oracle"; //비밀번호

	private static Connection conn;
	//DB 연결 메소드 선언.
	public static final Connection connect() throws ClassNotFoundException, SQLException{

		Class.forName(JDBC_DRIVER);

		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		return conn;
	}
	//DB 연결 종료 메소드 선언.
	public static void close() throws SQLException{
		if(conn!=null) {
			conn.close();
		}
	}
}
