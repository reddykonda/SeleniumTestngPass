package com;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.addListener(tla);
		
		List<String> suites = Lists.newArrayList();
		suites.add("testng.xml");
		testng.setTestSuites(suites);

		testng.run();

	}

}
