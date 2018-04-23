using Microsoft.VisualStudio.TestTools.UnitTesting;


namespace Alloy.Mvc.Template.Tests.Controllers
{
    [TestClass]
    public class StartPageControllerTest
    {
        [TestMethod]
        public void test()
        {
            string str = "test";
            
            // Assert
            Assert.IsNotNull(str);
        }

        [TestMethod]
        public void test2()
        {
            string str = null;

            // Assert
            Assert.IsNull(str);
        }


    }
}
