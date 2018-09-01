package vcampus.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void testToString() {
		User user = new User("yyt","123456");
		String result = user.toString();
		assertEquals("Username: yyt Password: 123456", result);
		
	}

}
