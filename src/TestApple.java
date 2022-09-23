package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApple {

	@Test  //+ve test case
	public void testCorrectColor() {
		Apple apple = new Apple();
		apple.setColor("red");
		assertTrue(apple.checkColor());
	}
	
	@Test //-ve test case
	public void testWrongColor() {
		Apple apple = new Apple();
		apple.setColor("blue");
		assertFalse(apple.checkColor());
	}

}
