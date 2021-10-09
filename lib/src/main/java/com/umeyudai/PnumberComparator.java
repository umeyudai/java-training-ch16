package com.umeyudai;

import java.util.Comparator;

public class PnumberComparator implements Comparator<Parking>{

	@Override
	public int compare(Parking o1, Parking o2) {
		
		return o1.getPnumber() - o2.getPnumber();
	}
	
	
}
