package Api;

import framework.EnvConfiguration;
import framework.Hooks;
import org.testng.annotations.Test;

public class TestOtomation {
    static Hooks hooks;
    static EnvConfiguration properties;

    @Test
    public void testApi(){
        properties.printUrl();
    }
}
