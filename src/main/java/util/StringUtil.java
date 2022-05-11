package util;

public class StringUtil {
	public static final String COMMA = ",";
	public static final char LEFT_PARENTHESIS = '(';
	public static final char RIGHT_PARENTHESIS = ')';
	public static final int PARENTHESIS_START_NO = 0;
	public static final int LAST_INDEX_DIFFERENCE = 1;
	
	public static String[] splitComma(String value) {
		return value.split(COMMA);
	}

	public static String removeParentheses(String value) {
		if (isEitherEndParenthesis(value)) {
			return value.substring(PARENTHESIS_START_NO + 1, getLastIndex(value));
		}
		return value;
	}
	
	private static boolean isEitherEndParenthesis(String value) {
		return value.charAt(PARENTHESIS_START_NO) == LEFT_PARENTHESIS && value.charAt(getLastIndex(value)) == RIGHT_PARENTHESIS;
	}
	
	private static int getLastIndex(String value) {
		return value.length() - LAST_INDEX_DIFFERENCE;
	}
	
	public static char findCharacter(String value, int index) {
		if (!compareLength(value, index)) {
			throw new StringIndexOutOfBoundsException("Index: " + index + ", Value Length: " + value.length() + " 문자열의 길이는 index의 길이보다 작아야 합니다.");
		}
		
		return value.charAt(index);
	}
	
	private static boolean compareLength(String value, int index) {
		return value.length() > index;
	}
}
