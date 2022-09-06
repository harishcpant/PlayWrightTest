package PlayWrightTest.PlayWrightTest;


import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FirstTest {

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
		      //Browser browser = playwright.chromium().launch();
		      Browser browser =playwright
		    		  .chromium()
		    		  .launch(new BrowserType.LaunchOptions()
		    		  .setHeadless(false).setSlowMo(3000));
		      Page page = browser.newPage();
		      page.navigate("http://playwright.dev");
		      System.out.println(page.title());
		      System.out.println("test...");
		    }
	}

}
