package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	private static final SimpleDateFormat formatter = new SimpleDateFormat();

	public static String format(final Date date) {
		formatter.applyPattern("dd/MM/yyyy HH:mm:ss");

		return formatter.format(date);
	}

	public static String format(final String pattern, final Date date) {
		formatter.applyPattern(pattern);

		return formatter.format(date);
	}
}
