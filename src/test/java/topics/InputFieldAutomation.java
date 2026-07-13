package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputFieldAutomation {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://qaplayground.com/practice/input-fields");

		// Type a Movie Name
		driver.findElement(By.id("movieNameInput")).sendKeys("Avenzers");
		driver.findElement(By.id("submitMovieBtn")).click();

		// Append Text & Press Tab
		String value = driver.findElement(By.id("appendInput")).getAttribute("value");
		System.out.println(value);

		driver.findElement(By.id("appendInput")).sendKeys(Keys.TAB);

		String result = driver.findElement(By.id("result-s01")).getText();
		System.out.println(result);
		
		// Read the Field Value
		String val =driver.findElement(By.id("readValueInput")).getAttribute("value");
		System.out.println(val);
		
		driver.findElement(By.id("readValueBtn")).click();
		String resVal = driver.findElement(By.id("result-s03")).getText();
		System.out.println(resVal);
		
		
		
		
		driver.quit();

	}

}