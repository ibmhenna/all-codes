import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestManager {

	@Test
	void testAssignBug() {
		Manager manager = new Manager();
		String result = manager.assignBug();
		Assert.assertEquals("bug assigned", result);
	}

	@Test
	void testAcknowledgeReport() {
		Manager manager = new Manager();
		String result1 = manager.acknowledgeReport();
		Assert.assertEquals("bug resolved", result1);
	}

}
