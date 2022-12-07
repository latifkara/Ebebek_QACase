package TestScenarios;

import Pages.Page;
import org.junit.Test;


public class TestPage {



    @Test
    public void testSearch() throws InterruptedException {
        Page page = new Page();
        page.searchElement();
    }
}
