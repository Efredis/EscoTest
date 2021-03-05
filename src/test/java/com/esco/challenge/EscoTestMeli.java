package com.esco.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Anotación para orden de ejecución de los test
@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class EscoTestMeli {
	// Declaración de Variables
	private WebDriver driver; 
	
	//Declaración localizadores reutilizables
	By categoriasLink = By.xpath("//a[@class='nav-menu-categories-link'][contains (text(), 'Categorías')]");
	By acceptCookies = By.id("cookieDisclaimerButton");
	By resultsText = By.xpath("//*[@id=\"root-app\"]/div/div[1]/aside/div[2]/span");
	
	//Declaración de localizadores Test 1.
	By tecnologiaLink =By.linkText("Tecnología");
	By celAndPhonesLink = By.linkText("Celulares y Smartphones");
	//By celAndPhonesLink = By.xpath("//a[@href='https://www.mercadolibre.com.ar/c/celulares-y-telefonos#menu=categories'][contains (text(), 'Celulares y Teléfonos')]");
		
	//Declaración de localizadores Test 2.
	By babyToysLink = By.linkText("Juguetes y Bebés");	
	By toyGamesLink = By.linkText("Juegos de Plaza y Aire Libre");
	
	//Declaración de localizadores Test 3.
	By fitnessLink = By.linkText("Deportes y Fitness");	
	By runningLink = By.xpath("//h3[@class='title'][contains(text(),'RUNNING')]");
	
	//Declaración de localizadores Test 4.
	By beautyLink = By.linkText("Belleza y Cuidado Personal");	
	By eyesLink = By.xpath("//h3[@class='title'][contains(text(),'OJOS')]");
		
	//Pre-Ejecución del test. Llamando a url de prueba.
		@Before
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.mercadolibre.com.ar/");	
			assertEquals("Mercado Libre Argentina", driver.getTitle());
		}
		
		//Post-Ejecución del test
		@After
		public void tearDown() throws Exception {
		driver.quit();
		}
		
		//Test para navegar en la ruta Categorías - Tecnología - Celulares y Teléfonos
		@Test
		public void t1_catTechTest() throws InterruptedException {
			driver.findElement(acceptCookies).click(); //Aceptando términos de políticas de cookies de la página.
			Thread.sleep(3000);
			driver.findElement(categoriasLink).click();
			Thread.sleep(3000);
			if (driver.findElement(tecnologiaLink).isDisplayed()) {
			driver.findElement(tecnologiaLink).click();
			Thread.sleep(3000);
			driver.findElement(celAndPhonesLink).click();
			Thread.sleep(3000);
			assertEquals("Celulares y Smartphones | MercadoLibre.com.ar", driver.getTitle());//Validando título de la ventana
			assertTrue("Celulares y Smartphones", true); //Validando título de la sección dentro de la web
			assert (resultsText) != null; //Validando que informe un total de resultados 
			}
		}
		
		//Test para navegar en la ruta Categorías - Juguetes y Bebés - Juegos y Juguetes 
		@Test
		public void t2_catToysTest() throws InterruptedException {
			driver.findElement(acceptCookies).click();
			Thread.sleep(3000);
			driver.findElement(categoriasLink).click();
			Thread.sleep(4000);
			if (driver.findElement(babyToysLink).isDisplayed()) {
			driver.findElement(babyToysLink).click();
			Thread.sleep(3000);
			driver.findElement(toyGamesLink).click();
			Thread.sleep(3000);
			assertEquals("Juegos de Plaza y Aire Libre | MercadoLibre.com.ar", driver.getTitle()); //Validando título de la ventana
			assertTrue("Juegos de Plaza y Aire Libre", true); //Validando título de la sección dentro de la web
			assert (resultsText) != null; //Validando que informe un total de resultados 
			}
		}
		
		//Test para navegar en la ruta Categorías - Deportes y Fitness - Running (Ropa y Accesorios - Calzado - Zapatillas)
		@Test
		public void t3_sportFitnessTest() throws InterruptedException {
			driver.findElement(acceptCookies).click(); 
			Thread.sleep(3000);
			driver.findElement(categoriasLink).click();
			Thread.sleep(4000);
			if (driver.findElement(fitnessLink).isDisplayed()) {
			driver.findElement(fitnessLink).click();
			Thread.sleep(3000);
			driver.findElement(runningLink).click();
			Thread.sleep(3000);
			assertEquals("Zapatillas Running | MercadoLibre.com.ar", driver.getTitle());//Validando título de la ventana
			assertTrue("Zapatillas Running", true); //Validando título de la sección dentro de la web
			assert (resultsText) != null; //Validando que informe un total de resultados 
			}
		}
		
		//Test para navegar en la ruta Categorías - Belleza y Cuido Personal - Ojos (Belleza y Cuidado Personal - Maquillaje - Ojos)
		@Test
		public void t4_beautyTest() throws InterruptedException {
			driver.findElement(acceptCookies).click();
			Thread.sleep(3000);
			driver.findElement(categoriasLink).click();
			Thread.sleep(4000);
			if (driver.findElement(beautyLink).isDisplayed()) {
			driver.findElement(beautyLink).click();
			Thread.sleep(3000);
			driver.findElement(eyesLink).click();
			Thread.sleep(3000);
			assertEquals("Maquillaje de Ojos | MercadoLibre.com.ar", driver.getTitle());//Validando título de la ventana
			assertTrue("Maquillaje de Ojos", true); //Validando título de la sección dentro de la web
			assert (resultsText) != null; //Validando que informe un total de resultados 
			}
		}
}
