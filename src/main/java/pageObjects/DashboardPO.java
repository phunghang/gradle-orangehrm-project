package pageObjects;

import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageUIs.DashboardUI;

public class DashboardPO extends BaseActions {
	private WebDriver driver;

	public DashboardPO(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public EmployeeListPO openEmployeeeList() {
		clickToElement(driver, DashboardUI.PIM_MODULE);
		waitIconLoadingInvisible();
		return PageGeneratorManager.getEmployeeListPO(driver);
	}

}
