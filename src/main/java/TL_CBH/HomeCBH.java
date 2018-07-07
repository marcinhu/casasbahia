package TL_CBH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeCBH {

	public WebElement menuCBH(WebDriver driver) {
		return driver.findElement(By.id("lnkCadastreSe"));
	}
	
	public WebElement emailCBH(WebDriver driver) {
		return driver.findElement(By.id("Email"));
	}
	
	public WebElement naocadastroCBH(WebDriver driver) {
		return driver.findElement(By.id("rbNaoCadastrado"));
	}
	
	public WebElement continuarCBH(WebDriver driver) {
		return driver.findElement(By.id("btnClienteLogin"));
	}
	
}
