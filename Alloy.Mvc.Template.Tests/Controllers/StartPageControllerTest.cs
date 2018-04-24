using Microsoft.VisualStudio.TestTools.UnitTesting;


namespace Alloy.Mvc.Template.Tests.Controllers
{
    [TestClass]
    public class StartPageControllerTest
    {
        [TestMethod]
        public void Test()
        {
            const string str = "test";

            // Assert
            Assert.IsNotNull(str);
        }

        [TestMethod]
        public void Test2()
        {
            const string str = null;

            // Assert
            Assert.IsNull(str);
        }


    }
}
