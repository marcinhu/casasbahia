package CT_CBH;

import TL_CBH.CadastroCBH;
import TL_CBH.HomeCBH;
import TL_CBH.Ident_CBH;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ElementNotVisibleException;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class CT_CBH_01 {
    
	private WebDriver driver;
	private HomeCBH homeCBH;
	private Ident_CBH ident_CBH;
	private CadastroCBH  cadastroCBH;
	String email = "email@email.com";
	String nomeCompleto = "Marcio";
	String   cpf   = "2333333333";
	String linkSenha = "Esqueci minha senha";
	String senha = "12345";
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		homeCBH = new HomeCBH();
		ident_CBH = new Ident_CBH();
		 cadastroCBH  = new CadastroCBH();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marci\\Documents\\DriveJar\\selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();        
        driver.get("https://www.casasbahia.com.br");
        
          homeCBH.menuCBH(driver).click();
          ident_CBH.emailCBH(driver).sendKeys(email);
          linkSenha = ident_CBH.esqueciCBH(driver).getText();
          Assert.assertEquals("Validacao","Esqueci minha senha",linkSenha);
          ident_CBH.naocadastroCBH(driver).click();
          ident_CBH.continuarCBH(driver).click();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          cadastroCBH.nomeCBH(driver).sendKeys(nomeCompleto);
          cadastroCBH.cpfCBH(driver).sendKeys(cpf);
          cadastroCBH.senhaCBH(driver).sendKeys(senha);
  
        
        
	}

}
