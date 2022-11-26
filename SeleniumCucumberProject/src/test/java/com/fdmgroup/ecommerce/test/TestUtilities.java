package com.fdmgroup.ecommerce.test;

public class TestUtilities {
	private static TestUtilities testUtilities;
	
	public static TestUtilities getInstance() {
		if (testUtilities == null) {
			testUtilities = new TestUtilities();
		}

		return testUtilities;
	}
	
	public TestUtilities() {
		super();
	}

	public Boolean searchItem() {
		return true;
	}

}
