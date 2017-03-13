package pt.courses.rackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Feedzai interview
 *
 */
public class Feedzai {

	/**
	 * Compare the content of 2 arrays and inform if their have the same
	 * content. Don't matter the order of the contents (e.g., ["a","b","c"] is
	 * equals to ["c","b","a"]).
	 *
	 *
	 * @param a
	 *            Array with the first content
	 * @param b
	 *            Array with the second content
	 * @return Boolean
	 */
	public static boolean someContents(String[] a, String b[]) {
		if (null != a && null != b) {

			if (a.length != b.length) {
				return false;
			}

			HashSet<String> hs1 = new HashSet<String>(Arrays.asList(a));
			HashSet<String> hs2 = new HashSet<String>(Arrays.asList(b));
			return hs1.equals(hs2);
		}
		return false;
	}

	/**
	 * Two words are called friendly if the letters of the first can be
	 * rearranged to produce the second (e.g., "silent" and "listen" are
	 * friendly). Write a program that given a set of words prints out all
	 * friendly words. Each set of friendly words should be printed on a
	 * separate line. Words without friends should not be printed. The output
	 * should be alphabetically ordered (across lines and within each line).
	 *
	 * @param input
	 *            An array with all the words to be processed.
	 * @return An array with each line of the output. Each line should have
	 *         already the friendly words. (eg.: the first line of the example
	 *         output is "cheating teaching"
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String[] friendlyWords(String[] input) {
		if (input == null) {
			return null;
		}

		HashMap<Long, ArrayList<String>> hm = new HashMap<Long, ArrayList<String>>();
		long total;
		ArrayList<String> friendlys;
		for (String word : input) {
			total = 0;
			for (int i = 0; i < word.length(); i++) {
				total += word.charAt(i);
			}
			friendlys = hm.get(total);
			if (null == friendlys) {
				friendlys = new ArrayList<String>();
				friendlys.add(word);
				hm.put(total, friendlys);
			} else {
				friendlys.add(word);
			}
		}

		StringBuilder sb = new StringBuilder();
		ArrayList<String> result = new ArrayList<String>();
		for (Iterator iterator = hm.values().iterator(); iterator.hasNext();) {
			friendlys = (ArrayList<String>) iterator.next();
			if (2 <= friendlys.size()) {
				Collections.sort(friendlys);
				sb.setLength(0);
				for (int i = 0; i < friendlys.size(); i++) {
					sb.append(friendlys.get(i));
					if (i + 1 < friendlys.size()) {
						sb.append(" ");
					}
				}
				result.add(sb.toString());
			}
		}
		return result.toArray(new String[result.size()]);
	}
}
