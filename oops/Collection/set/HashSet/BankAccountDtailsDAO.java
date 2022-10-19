package com.corejava.Collection.set.HashSet;

import java.util.HashSet;
import java.util.LinkedList;

import com.qac.corejava.Collection.List.dto.HospitalDTO;

public class BankAccountDtailsDAO {
	
	HashSet <String>set = new HashSet<String>();
	private BankAccountDtailsDTO dto;
	public String save(BankAccountDtailsDTO dto) {
		this.dto = dto;
		set.addAll(set);
		return dto.getName()+"data saved";
	}
	Object [] bankAccountDtailsDAO=set.toArray();
	public String SearchByName(String name) {
		HashSet nameSet = new HashSet();
		for(String object: set) {
			BankAccountDtailsDTO dto = (BankAccountDtailsDTO)set.clone();
			if (dto.getName().equals(name)) {
				nameSet.add(dto);
			}
		}
		return name;
	}
	public long SearchByAccountNumber(long AccountNumber) {
		HashSet nameSet = new HashSet();
		for(String object: set) {
			BankAccountDtailsDTO dto = (BankAccountDtailsDTO)set.clone();
			if (dto.getAccountNumber()==(AccountNumber)) {
				nameSet.add(dto);
			}
		}
		return AccountNumber;
	}
	public String SearchByIFCS(String iFSC) {
		HashSet nameSet = new HashSet();
		for(String object: set) {
			BankAccountDtailsDTO dto = (BankAccountDtailsDTO)set.clone();
			if (dto.getiFSC().equals(iFSC)) {
				nameSet.add(dto);
			}
		}
		return iFSC;
	}
	public long removeByAccountNumber(long AccountNumber) {
		HashSet nameSet = new HashSet();
		for(String object: set) {
			BankAccountDtailsDTO dto = (BankAccountDtailsDTO)set.clone();
			if (dto.getAccountNumber()==(AccountNumber)) {
				nameSet.add(dto);
			}
		}
		return AccountNumber;
	}
	public long updateMoNoByAccountNumber(long AccountNumber) {
		HashSet nameSet = new HashSet();
		for(String object: set) {
			BankAccountDtailsDTO dto = (BankAccountDtailsDTO)set.clone();
			if (dto.getAccountNumber()==(AccountNumber)) {
				nameSet.add(dto);
			}
		}
		return AccountNumber;
	}
	public String updateMoNoByName(String name) {
		HashSet nameSet = new HashSet();
		for(String object: set) {
			BankAccountDtailsDTO dto = (BankAccountDtailsDTO)set.clone();
			if (dto.getName().equals(name)) {
				nameSet.add(dto);
			}
		}
		return name;
	

}
}