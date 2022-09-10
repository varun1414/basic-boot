package com.example.standards.utility;

import java.util.Comparator;

import com.example.standards.entity.Hotel;

public class CompareRating  implements Comparator<Hotel>{
	
    public int compare(Hotel a, Hotel b)
    {
 
        return a.getStars() - b.getStars();
    }
}
