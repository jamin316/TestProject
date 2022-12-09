package data;

import utilities.Xls_Reader;

public class DataFile {

	Xls_Reader d = new Xls_Reader("C:\\SELENIUM\\testing\\NikulTest.xlsx");

	// LoginTest Data
	public String wrongEmail = d.getCellData("Data1", "UserName", 3);
	public String wrongPassword = d.getCellData("Data1", "Password", 3);
	public String emailWithSpclChar = d.getCellData("Data1", "UserName", 4);
	public String spclCharError = d.getCellData("Data1", "Email Error", 5);
	public String emptyEmailError = d.getCellData("Data1", "Email Error", 4);
	public String emptyPasswordError = d.getCellData("Data1", "Password Error", 3);
	public String globalError = d.getCellData("Data1", "Global Error", 2);

	// Footer
	
	
	
	// UserProfile
	
	
	
	// AddToCart
	
	
	
	// Search
}
