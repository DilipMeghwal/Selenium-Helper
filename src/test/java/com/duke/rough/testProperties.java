package com.duke.rough;

import java.util.HashMap;
import java.util.Map;

import com.duke.utilities.ExcelUtils;


public class testProperties {
	public static void main(String[] args){
		HashMap<String,String> map = ExcelUtils.getInstance().readData("testData.xlsx", "sheet1", "user1");
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
	}

}
