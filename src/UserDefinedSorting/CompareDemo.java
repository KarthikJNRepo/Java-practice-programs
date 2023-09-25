package UserDefinedSorting;

import java.util.ArrayList;
import java.util.Collections;

public class CompareDemo implements Comparable<CompareDemo> {
	
	private double rating;
	private String name;
	private int year;
	
	public CompareDemo(String name, double rating, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }



	@Override
	public int compareTo(CompareDemo o) {
		if((int)o.rating!=(int)this.rating) {
			return (int) (this.rating-o.rating);
		}
		return this.year-o.year;	
	}
}
