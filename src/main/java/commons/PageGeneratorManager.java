package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageGeneratorManager {

	public static AddNewEmployeePO getAddEmployeePO(WebDriver driver) {
		return new AddNewEmployeePO(driver);
	}

	public static ContactDetailPO getContactDetailPO(WebDriver driver) {
		return new ContactDetailPO(driver);
	}

	public static DashboardPO getDashboardPO(WebDriver driver) {
		return new DashboardPO(driver);
	}

	public static DependentsPO getDependentsPO(WebDriver driver) {
		return new DependentsPO(driver);
	}

	public static EmergencyContactsPO getEmergencyContactsPO(WebDriver driver) {
		return new EmergencyContactsPO(driver);
	}

	public static EmployeeListPO getEmployeeListPO(WebDriver driver) {
		return new EmployeeListPO(driver);
	}

	public static LoginPO getLoginPO(WebDriver driver) {
		return new LoginPO(driver);
	}

	public static PersonnalDetailPO getPersonnalDetailPO(WebDriver driver) {
		return new PersonnalDetailPO(driver);
	}

}
