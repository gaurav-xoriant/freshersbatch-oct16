package com.sample.mockito.SampleMockito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;


@RunWith(MockitoJUnitRunner.class)
public class DBConnectionTest {
	@Mock
	private static Connection c;
	@Mock
	private static PreparedStatement ps;
	@Mock
	private static ResultSet rs;
	
	DatabaseOpr d=new DatabaseOpr();
	@Before
	public void setup() throws Exception{
		d=Mockito.mock(DatabaseOpr.class);		
		c=Mockito.mock(Connection.class);
		PowerMockito.mockStatic(DriverManager.class);
		ps=Mockito.mock(PreparedStatement.class);
		rs=Mockito.mock(ResultSet.class);
		Mockito.when(DriverManager.getConnection(Mockito.anyString(),Mockito.anyString(),Mockito.anyString())).thenReturn(c);
	}
	@Test
	public void test(){
		
	}

	
	
}
