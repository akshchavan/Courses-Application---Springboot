package com.springrest.springrest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringrestApplicationTests {

	 private Calculator c = new Calculator ();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		
		//expected..
		int expectResult = 17;
		
		//actual..
		int actualResult = c.doSum(12, 3, 2);
		
		assertThat(actualResult).isEqualTo(expectResult);
	}
	
	@Test
	void testProduct() {
		
		//expected..
		int expectResult = 40;
		
		//actual..
		int actualResult = c.doProduct(8, 5);
		
		assertThat(actualResult).isEqualTo(expectResult);
	}
	
	@Test
	void testCompareTwoNum() {
		
		//actual..
		boolean actualResult = c.compareTwoNum(10, 10);
		
		assertThat(actualResult).isTrue();
		
	}

}
