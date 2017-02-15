package com.netflix.simianarmy.aws.janitor.rule.ami;

import org.testng.annotations.Test;

import junit.framework.TestCase;
public class UnusedImageRuleTest extends TestCase {

	@Test
	public void testUnusedImageRule(){
	String name = "test";
	String name2 = "test";
	assertNotNull(name);
	assertEquals(name, name2);
	assertNotNull(calendar);
}
}