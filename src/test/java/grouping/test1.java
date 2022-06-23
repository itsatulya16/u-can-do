package grouping;

import org.testng.annotations.Test;

public class test1 {
	
	@Test(groups="aur")
	void TC01() {
		System.out.println("Tc01");
	}
	
	
	@Test(groups="pu")
	void TC02() {
		System.out.println("Tc02");
	}
	
	@Test(groups="pu")
	void TC03() {
		System.out.println("Tc03");
	}
	
	@Test(groups="aur")
	void TC04() {
		System.out.println("Tc04");
		
	}

}
