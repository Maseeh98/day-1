import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestMath {

	@Test
	void testAdd() {
		Math math = new Math();
		int result = math.add(1,2,3);
		Assert.assertEquals(6, result);
		
	}

}