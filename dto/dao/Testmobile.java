package com.crud.dto.dao;
import java.util.HashSet;

import com.crudoperation.Mobiledao;
import com.crudoperation.Mobiledto;

public class Testmobile  {
	public static void main(String[] args) {
		
		Mobiledto nikunjsir=new Mobiledto();
		
		nikunjsir.setmobileId(1234);
		nikunjsir.setmodelname("INikunjsir1100");
		nikunjsir.setbrandName("iNikunjSir");
		nikunjsir.setprice1(100000);
		nikunjsir.setSerielNumber("805XXXX254");
		nikunjsir.setnoOfCamera(2);
		
		Mobiledao mobile = new Mobiledao();
		HashSet xyz=mobile.getAll();
		System.out.println(xyz);
		Mobiledto yuva=mobile.deleteBymobileId(1234);
		System.out.println(yuva);
		Mobiledto g=mobile.UpdateByserialNumber("805XXXX254");
		System.out.println(g);
		Mobiledto sr=mobile.getAllbybrandName("iNikunjsir");
		System.out.println(sr);
	}
M
		