package registration;

import static org.junit.Assert.*;
import org.junit.Test;
import org.joda.time.LocalDate;
import registration.Student;	


public class UsernameTest {

	@Test
	public void test() {
		LocalDate date = new LocalDate(2010, 2, 28);
		Student test = new Student("Sibi Isac", date,12100930);
		String result = test.getUsername();
		assertEquals(result, "SibiIsac7");

	}

}
