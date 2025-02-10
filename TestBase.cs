using OpenQA.Selenium;
using OpenQA.Selenium.Edge;
using OpenQA.Selenium.Support.UI;

namespace STARpricingNunit.Utilities
{
    public class TestBase
    {
        // WebDriver instance for the test session
        public IWebDriver Driver;

       
       


        // SetUp method to initialize the browser and load the application
        [SetUp]
        public void InitializeWebDriver()
        {
            // Initialize the Edge browser and configure browser settings
            Driver = new EdgeDriver();
            Driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(100); // Set implicit wait
            Driver.Manage().Window.Maximize(); // Maximize the browser window

            // Navigate to the application URL
            Driver.Url = "https://orgb937e684.crm.dynamics.com/main.aspx?appid=d0ea9eab-8e56-ef11-a316-6045bd016837&pagetype=entitylist&etn=veeru_opportunityscoping&viewid=c073d018-3558-ef11-a316-6045bd016837&viewType=1039";
          //  Driver.FindElement(By.XPath("//input[@name='Password']")).SendKeys("Prasad13$12345!!");
          //  Driver.FindElement(By.XPath("//input[@name='Password']")).SendKeys(Keys.Enter);
          //  Driver.FindElement(By.XPath("//input[@id='idSIButton9']")).SendKeys(Keys.Enter);
            // Wait until the page is fully loaded
            new WebDriverWait(Driver, TimeSpan.FromSeconds(100)).Until(
                driver => ((IJavaScriptExecutor)driver).ExecuteScript("return document.readyState").Equals("complete"));
        }
        public void Wait()
        {
            Thread.Sleep(2000);
        }
        // TearDown method to quit the browser after test completion
        [TearDown]
        public void CloseWebDriver()
        {
            // Close the browser and quit the WebDriver session
            Driver.Quit();
        }
    }
}