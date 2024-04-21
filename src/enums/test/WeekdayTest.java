package enums.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enums.Weekday;

class WeekdayTest {

	@Test
	void testSwitchExpression() {
		String expected = "Working day";
		assertEquals(expected, getDayDescription(Weekday.MON));
	}

	private String getDayDescription(Weekday day) {
		String result = switch(day) {
			case SUN -> "Weekend if you live not in Israel";
			case FRI -> "Weekend if you live in Israel";
			case SAT -> "Weekend";
			default -> "Working day";
		};
		return result;
	}

}
