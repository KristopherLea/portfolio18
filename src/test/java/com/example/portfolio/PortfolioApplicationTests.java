package com.example.portfolio;

import com.example.portfolio.Model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class PortfolioApplicationTests {

	//Arrange

	User user;

	@BeforeEach
	public void setUp() {
		user = new User();
		System.out.println(user);
	}
	//Act
	@Test
	public void testFirstName() {
		String expected = "Kris";
		user.setFirstName("Kris");
		String actual = user.getFirstName();
		//Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testLastName() {
		String expected = "Lea";
		user.setLastName("Lea");
		String actual = user.getLastName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameNull(){
		assertNull(user.getFirstName());
	}

	@Test
	public void testGetLastNameNull() {
		assertNull(user.getLastName());
	}

}