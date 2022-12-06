package Karate;


import com.intuit.karate.junit5.Karate;

public class runner {
    @Karate.Test
    Karate TestPage(){
        return Karate.run().relativeTo(getClass());
    }

}
