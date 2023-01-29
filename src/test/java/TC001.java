import Base.BaseTest;
import Pages.AllPages;
import Pages.MainPage;
import org.testng.annotations.Test;

public class TC001 extends BaseTest {
   AllPages allPages=new AllPages();
   @Test
public void test01(){
      allPages.mainPage().go_To_Url("https://www.hepsiburada.com");

}


}
