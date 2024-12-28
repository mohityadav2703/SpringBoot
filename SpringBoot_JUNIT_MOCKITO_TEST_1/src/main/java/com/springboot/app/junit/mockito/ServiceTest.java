package com.springboot.app.junit.mockito;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class ServiceTest {

	@Mock
	Repository repository;
	
	@InjectMocks
	Service service;
	
	@Test
	@Order(200)
	@DisplayName("SUCCESS TEST")
	void testSuccess() {
		//SETUP MOCK SCENARIO
		try {
			Mockito.when(repository.getData()).thenReturn(Arrays.asList("A","B","CDEFGHIJK","12345","1234"));
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		//EXECUTE THE SERVICE THAT USES THE MOCKED REPOSITORY
		List<String> data=service.getDataLen();
		
		//validate the response
		Assertions.assertNotNull(data);
							// EXPECTED NUMBER OF OUTPUT, OUTPUT SIZE
		Assertions.assertEquals(3, data.size());
	}
	
	@Test
	@Order(50)
	@DisplayName("FAIL TEST")
	void testException() {
		//SETUP MOCK SCENARIO
		try {
			Mockito.when(repository.getData()).thenThrow(new SQLException("Connection Exception"));
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		//EXECUTE THE SERVICE THAT USES THE MOCKED REPOSITORY
		List<String> data=service.getDataLen();
		
		//VALIDATE THE RESPONSE
		Assertions.assertNotNull(data);
							//EXPECTED NUMBER OF OUTPUT, OUTPUT SIZE
		Assertions.assertEquals(0,data.size());
	}
	
}
