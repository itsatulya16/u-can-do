package grouping;

import org.testng.annotations.Test;

public class test2 {
	@Test(groups="aur")
	void TC11() {
		System.out.println("tc11");
	}

	@Test(groups="aur")
	void TC12() {
		System.out.println("tc12");
		
	}
	
	@Test(groups="pu")
	void TC13() {
		System.out.println("tc13");
	}
	
	@Test(groups="pu")
	void TC14() {
		System.out.println("tc14");
	}
}

