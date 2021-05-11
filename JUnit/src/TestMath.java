import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestMath {

	Math math;

	@BeforeEach
	void init() {
		System.out.println("init");
		math = new Math();
	}

	@Test
	void testAdd() {
		int result = math.add(1, 2, 3);
		Assert.assertEquals(6, result);
	}

	@Test
	void testAddWithNegativeNumbers() {
		int result1 = math.add(-1, -2, -3);
		Assert.assertEquals(-6, result1);
	}

	@Test
	void testMultiply() {
		int result = math.multiply(5, 2);
		Assert.assertEquals(10, result);
	}

	@Test
	void testMultiplyWithOneZero() {
		int result = math.multiply(5, 0);
		Assert.assertEquals(0, result);
	}

	// to multiply two posetive numbers...the following code should give an illegal

	void testMultiplyWithOneNegative() {
		Exception exception = assertThrows(IllegalArgumentException.class,()->{
			math.multiply(5,-2);	
		});

}}
