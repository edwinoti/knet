package knet.test.com;


public class ClerkPageTest {
	
private ClerkPage clerkpage;
	
	@Before
	private void setUp() {
		clerkpage  = new ClerkPage(/home/edwin/chrome.exe);
	
	}
	
	
	@after
	public void tearDown() {
		clerkpage.closeBrowser();
	}
	
	
	@Test
	public void testOpenLogin() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		clerkpage.LoginClerk();
		
	}
	
	
	@Test
	public void testDashboad() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		clerkpage.dashBoard();
		
	}
	
	
	@Test
	public void testDashboadForm() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		clerkpage.fillClerkForm();
		
	}
	
	@Test
	public void testClerkBackButton() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		clerkpage.back();
		
	}
	
	
	
	@Test
	public void testClerkLogout() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		clerkpage.Logout();
		
	}
	
	@Test
	public void testClerkUploadCSV() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		clerkpage.uploadCSV();
		
	}

}
