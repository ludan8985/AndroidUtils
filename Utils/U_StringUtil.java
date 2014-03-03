package cn.redonly.trainman4ios.testutil;

public class U_StringUtil {

	/**
	 * 字符串是否为空判断
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str == null || "".equals(str)) {
			return true;
		}
		return false;
	}

	/**
	 * 判断2个字符串是否相等
	 * 
	 * @param str
	 * @param str1
	 * @return
	 */
	public static boolean isStringEquals(String str, String str1) {
		if (str.equals(str1) || (str == str1)) {
			return true;
		} 
		return false;
	}
	
}
