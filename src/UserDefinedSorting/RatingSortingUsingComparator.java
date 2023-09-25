package UserDefinedSorting;

import java.util.Comparator;

public class RatingSortingUsingComparator implements Comparator<CompareDemo> {
	// ob1>ob2 returns 1 -->
	// obj2>obj1 return -1 <--
	// obj1=obj2 return 0 =
	@Override
	public int compare(CompareDemo o1, CompareDemo o2) {
		int i = 0;
		if (o1.getRating() != o2.getRating()) {
			if (o1.getRating() > o2.getRating()) {
				i = 1;
				return i;
			} else if (o1.getRating() < o2.getRating()) {
				i = -1;
			}
			return i;
		}

		if (o1.getYear() > o2.getYear()) {
			i = 1;
			return i;
		} else if (o1.getYear() < o2.getYear()) {
			i = -1;
		}
		return i;

	}

}
