package test;

import java.io.IOException;

import generic.basetest;
import pom.data;

public class run extends basetest {

	
	public void go() throws IOException, InterruptedException {
		
		data d=new data(driver);
		d.submit();
		
	}
	
}
