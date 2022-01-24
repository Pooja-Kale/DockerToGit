package study;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinalDockerApplicationTests {

	@Test
	public void testInputIsEven()
	{
	 assertTrue(FinalDockerApplication.checkIfInputIsAnEvenNumber(22)); // Assertion
	}

}
