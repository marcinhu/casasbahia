package TL_CBH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroCBH {
	
	public WebElement nomeCBH(WebDriver driver) { return driver.findElement(By.xpath("//input[@id='NomeCompleto']"));}

	public WebElement senhaCBH(WebDriver driver) { return driver.findElement(By.xpath("//input[@id='Senha']"));}

	public WebElement cpfCBH(WebDriver driver) {
		return driver.findElement(By.id("Cpf"));
	}
	
	public WebElement fone1CBH(WebDriver driver) {
		return driver.findElement(By.id("TipoFone1"));
	}
	
	public WebElement ddd1CBH(WebDriver driver) {
		return driver.findElement(By.id("Telefone1DDDPF"));
	}
	
	public WebElement nro1CBH(WebDriver driver) {
		return driver.findElement(By.id("Telefone1PF"));
	}
	
	public WebElement fone2CBH(WebDriver driver) {
		return driver.findElement(By.id("TipoFone2"));
	}
	
	public WebElement ddd2CBH(WebDriver driver) {
		return driver.findElement(By.id("Telefone2DDDPF"));
	}
	
	public WebElement nro2CBH(WebDriver driver) {
		return driver.findElement(By.id("Telefone2PF"));
	}
	
	public WebElement diaCBH(WebDriver driver) {
		return driver.findElement(By.id("DataNascimentoDia"));
	}
	
	public WebElement mesCBH(WebDriver driver) {
		return driver.findElement(By.id("DataNascimentoMes"));
	}
	
	public WebElement anoCBH(WebDriver driver) {
		return driver.findElement(By.id("DataNascimentoAno"));
	}
	
	public WebElement sexoCBH(WebDriver driver) {
		return driver.findElement(By.id("Sexo"));
	}
	
	public WebElement confemailCBH(WebDriver driver) {
		return driver.findElement(By.id("ConfirmarEmail"));
	}
	
//	public WebElement senhaCBH(WebDriver driver) {
//		return driver.findElement(By.id("Senha"));
//	}
	
	public WebElement confsenhaCBH(WebDriver driver) {
		return driver.findElement(By.id("ConfirmarSenha"));
	}
	
	public WebElement confcadastroCBH(WebDriver driver) {
		return driver.findElement(By.id("btnClienteSalvar"));
	}
	
}
