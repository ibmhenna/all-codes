
public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = {8,22,7,9,31,5,13};
		int count = 0;
		int swap = 0;
		
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = 0; j < numbers.length-i-1; j++) {
				if (numbers[j]>numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					swap++;
				}
				count++;
			}
			count++;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);	
		}
		System.out.println("Count = "+count);
		System.out.println("Swaps = "+swap);
	}
}
