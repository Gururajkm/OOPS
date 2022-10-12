package com.AQ.Train.DAO;

import com.AQ.Train.DTO.ChennaiExppressDTO;

public class TrainDAO {

	ChennaiExppressDTO[] ChennaiExppress = new ChennaiExppressDTO[5];

	public void save(ChennaiExppressDTO mumbai) {
		ChennaiExppress[0] = mumbai;
	}

	public String deleteByStartfrom(String startfrom) {
		for (int i = 0; i < chennaiexpress.length; i++) {
			if (chennaiexpress[0] != null && chennaiexpress[i].getStartfrom().equals(startfrom)) {
				chennaiexpress = null;
				return "Deleted" + startfrom;
			}
		}
		return "compartments" + startfrom + "not present";
	}

}
