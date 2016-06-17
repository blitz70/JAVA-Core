package codewars.kyu7;

public class Kata {

	// Find Count of Most Frequent Item in an Array
	public static int mostFrequentItemCount(int[] collection) {

		//make count array
		int no_min = 0;
		int no_max = 0;
		for (int i = 0; i < collection.length; i++) {
			if (no_min > collection[i]) {
				no_min = collection[i];
			};
			if (no_max < collection[i]) {
				no_max = collection[i];
			}
		}		
		System.out.println(no_min + " " + no_max);
		int[] count = new int[no_max - no_min + 1];
		
		//use count array
		int result = 0;
		for (int i = 0; i < collection.length; i++) {
			int number = collection[i];
			count[number - no_min] += 1;
			if (result < count[number - no_min]) {
				result = count[number - no_min];
			}
		}
		System.out.println(result);
		return result;
	}

	public static void test(Object correct, Object value) {
		if (correct == value) {
			System.out.println("passed");
		} else
			System.out.println("failed");
	}

	public static void main(String[] args) {
		int[] collection1 = {3, -1, -1};
		int[] collection2 = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
		test(2, mostFrequentItemCount (collection1));
		test(5, mostFrequentItemCount (collection2));
	}

}
