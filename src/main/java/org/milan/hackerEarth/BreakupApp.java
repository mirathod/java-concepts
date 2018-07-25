package org.milan.hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Breakup App - Linear Search
 * 
 * @author rathom1
 *
 */
public class BreakupApp {
	static int date = 0, noDate = 0;

	public static void main(String args[]) throws Exception {

		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		List<String> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(br.readLine());
		}

		System.out.println(getDate(list));
	}

	private static String getDate(List<String> list) {

		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String str) {
				Scanner sn = new Scanner(str).useDelimiter("[^\\d]+");
				if (str.startsWith("G")) {
					while (sn.hasNext()) {
						String num = sn.next();
						if (num.equals(String.valueOf(19)) || num.equals(String.valueOf(20))) {
							date += 2;
						} else {
							noDate += 2;
						}
					}
				} else {

					while (sn.hasNext()) {
						String num = sn.next();
						if (num.equals(String.valueOf(19)) || num.equals(String.valueOf(20))) {
							date += 1;
						} else {
							noDate += 1;
						}
					}

				}

			}
		});
		if (date > noDate) {
			return "Date";
		}
		return "No Date";
	}
}
