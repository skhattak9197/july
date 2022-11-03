package grouping;

import org.testng.annotations.Test;

@Test (groups = "runall")
public class GROUP_LEVEL {

	@Test (groups = {"sanity"})
	public void tc() {
	System.out.println("This is tc");	
	}
	@Test(groups = {"regression", "sanity"})
	public void tc1() {
		System.out.println("This is tc1");
	}
	@Test(groups = {"smoke"})
	public void tc2() {
		System.out.println("This is tc2");	
	}
	@Test(groups = {"smoke", "sanity"})
	public void tc3() {
		System.out.println("This is tc3");	
	}
	@Test(groups = {"sanity", "regression"})
	public void tc4() {
		System.out.println("This is tc4");
	}
	@Test(groups = {"regression"})
	public void tc5() {
		System.out.println("This is tc5");
	}
}
