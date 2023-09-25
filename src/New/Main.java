package New;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create an array of integers
    int[] array = {1, 2, 3, 2, 1, 3, 3, 4,6,2,2,2,6};

    // Create a HashMap to store the frequencies of the integers
    HashMap<Integer, Integer> frequencies = new HashMap<>();

    // Count the frequencies of the integers in the array
    for (int n : array) {
      if (frequencies.containsKey(n)) {
        frequencies.put(n, frequencies.get(n) + 1);
      } else {
        frequencies.put(n, 1);
      }
    }

    // Find the number with the highest frequency
    int highestFrequency = 0;
    int highestFrequencyNumber = 0;
    for (int n : frequencies.keySet()) {
      int frequency = frequencies.get(n);
      if (frequency > highestFrequency) {
        highestFrequency = frequency;
        highestFrequencyNumber = n;
      }
    }

    // Print the highest frequency number
    System.out.println(highestFrequencyNumber);
    System.out.println(highestFrequency);
  }
}
