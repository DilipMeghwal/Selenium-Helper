package com.duke.rough;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class testProperties {
	 public static final Logger log = LogManager.getLogger(testProperties.class);
	public static void main(String[] args) throws IOException, InterruptedException {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat f = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss_SSSSSS");
			System.out.println("f "+ f.format(cal.getTime()));
			System.out.println("OP1 " + f.format(cal.getTime()).split("_",4)[0]);
			System.out.println("OP2 " + f.format(cal.getTime()).split("_",4)[1]);
			Thread.sleep(150);
	}

}
