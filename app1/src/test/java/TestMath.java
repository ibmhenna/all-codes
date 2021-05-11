import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMath {
	Math math ;
	@BeforeEach
	void init() {
		System.out.println("init");
		math = new Math();
	}
	
	@Test
	void testAdd() {
		int result = math.add(1, 2, 3);
		assertEquals(6, result);
	}

	@Test
	void testAddWithNegativeNumbers() {
		int result1 = math.add(-1, -2, -3);
		assertEquals(-6, result1);
	}

	@Test
	void testMultiply() {
		int result = math.multiply(1,2);
		assertEquals(2, result);
	}
	@Test
	void testMultiplyWithOneZero() {
		int result = math.multiply(1,0);
		assertEquals(0, result);
	}
//	@Test
//	void testMultiplyWithOneNegative() {
//		Exception exception = assertThrows(IllegalArgumentException.class,()-> {
//			math.multiply(1,-1);
//		});
//	}
}


