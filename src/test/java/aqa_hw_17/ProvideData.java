package aqa_hw_17;

import org.testng.annotations.DataProvider;

public class ProvideData {

    @DataProvider(name = "searchData")
    public Object[][] searchData() {
        return new Object[][]{
                {"лампа"},
                {"чашка"},
                {"корм для котів"}
        };
    }
}
