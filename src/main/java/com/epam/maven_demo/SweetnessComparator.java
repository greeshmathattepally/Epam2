package com.epam.maven_demo;
import java.util.*;
public class SweetnessComparator implements Comparator<Chocolate>{
    public int compare(Chocolate c1,Chocolate c2)
    {
    	return c1.weight-c2.weight;
    }
}
