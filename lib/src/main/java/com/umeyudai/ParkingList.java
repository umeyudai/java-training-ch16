package com.umeyudai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ParkingList {

	public static void main(String[] args) {
		List<Parking> list = new ArrayList<>(); 
		list.add(new Parking(101,LocalDate.of(2020, 3, 12), "X-111-222"));
		list.add(new Parking(102,LocalDate.of(2021, 7, 8), "Y-111-222"));
		list.add(new Parking(205,LocalDate.of(2021, 10, 1), "Z-111-222"));
		
		list.sort(new PnumberComparator());

		for(Parking pk : list) {
			System.out.println(pk);
		}
	}

}
