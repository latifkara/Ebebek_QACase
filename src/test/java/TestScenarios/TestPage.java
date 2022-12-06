package TestScenarios;

import Pages.Page;
import org.junit.Test;


public class TestPage {

    private Page page;

    @Test
    public void testSearch(){
        page = new Page();
        page.searchElement();
    }
}
