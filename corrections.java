public class corrections {

	public static String recombine(String word1, String word2) {
		String result = " ";
		String word1Front = " ";
		String word2Back = " ";

		if (word1.length() % 2 == 0) {
			word1Front  = word1.substring(0, word1.length() / 2);
		}
		if (word2.length() % 2 == 0) {
			word2Back = word2.substring(word2.length() / 2, word2.length());
		}else if (word2.length() % 2 == 1) {
			word2Back = word2.substring((word2.length() / 2) - 1, word2.length());
		}
		result = word1Front + word2Back;
		return result;
	}

	public static String mixedWords(String[] words) {
		String[] result = new String(words.length());
		for (int i=0; i<words.length; i++) {
			if (i % 2 == 0) {
				result[i] = recombine(words[i], words[i+1]);
			}else {
				result[i] = recombine(words[i], words[i-]);
			}
		}
		return result;
	}

	public static int getPeakIndex(int[] array) {
		// int result = -1;
		// for (int i=1;i<array.length - 1;i++ ) {
		// 	if (array[i] > array[i-1] && array[i] > array[i+1]) {
		// 		result = i;
		// 	}
		// }
		// return result;
		for (int k = 1; k<array.length - 1; k++) {
			if (array[k-1] < array[k] && array[k] > array[k+1]) {
				return k;
			}
		}
		return -1;
	}

	public static boolean isMountain(int[] arr) {
		// boolean result = false;
		// if (getPeakIndex(array) == -1) {
		// 	result = false;
		// }else if (getPeakIndex)
		int peakspot = getPeakIndex(array);
		return (peak != -1) && isIncreasing(array, peakspot) && isDecreasing(array, peakspot);
	}


}