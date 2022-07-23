package leetcode;

public class leetCode14 {
	public String longestCommonPrefix(String[] strs) {
		String prefix = "";
		if (strs.length == 0) {
			return prefix;
		}
		prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			String pre = strs[i];
			while (pre.indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}
}
