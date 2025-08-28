package firstTestngsample;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(priority=-7)
	private void tc01() {
		System.out.println("test1");

	}
	@Test(priority=-2)	
     private void tc02() {
	System.out.println("test2");

}
    @Test(priority=1) 
     private void tc03() {
		System.out.println("test3");

	}
     @Test(priority=7)
     private void tc04() {
		System.out.println("test4");

	}
}
