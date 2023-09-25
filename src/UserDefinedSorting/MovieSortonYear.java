package UserDefinedSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import UserDefinedSorting.CompareDemo;

class MovieSortonYear
{
	public static void main(String[] args)	
	{
		ArrayList<CompareDemo> list = new ArrayList<CompareDemo>();
		list.add(new CompareDemo("Force Awakens", 9.8, 2015));
		list.add(new CompareDemo("Star Wars", 5.7, 1977));
		list.add(new CompareDemo("Empire Strikes Back", 9.8, 2010));
		list.add(new CompareDemo("Return of the Jedi", 1.4, 1983));

		Collections.sort(list);
		//Collections.sort(list, new RatingSortingUsingComparator());

		System.out.println("Movies after sorting : ");
		for (CompareDemo movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
	}
}