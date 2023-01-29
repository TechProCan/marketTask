package Pages;

public class AllPages {
    public AllPages(){}

    private MainPage mainPage;
    private HomePage homePage;

    public MainPage mainPage(){
        if (mainPage==null){
            mainPage=new MainPage();
        }
        return mainPage;
    }
    public HomePage homePage(){
        if (homePage==null){
            homePage=new HomePage();
        }
        return homePage;
    }
}

