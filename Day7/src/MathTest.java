import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMath {

	Math math;
	@BeforeEach
	void init() {
		System.out.println("init");
		math = new Math();
	}
	@Test
	void testAdd() {
		Math math = new Math();
		int result = math.add(1,2,3);
		Assert.assertEquals(6, result);
		
	}
	@Test
	void testMultiply() {
		int result = math.multiply(1,2);
		Assert.assertEquals(2, result);
	}
//	@Test
//	void testAddwithNegativeNumbers() {
//		int result1 = math.add(-1,-2,-3);
//		Assert.assertEquals(-6, result1);
//		
//	}

//	@Test
//	void testMultiplywithOneZero() {
//		int result = math.multiply(1,0);
//		Assert.assertEquals(0, result);
//	}
//	@Test
//	void testMultiplywithOneNegative() {
//		int result = math.multiply(1,-1);
//		Assert.assertEquals(-1, result);
//	}

}