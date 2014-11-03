import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void createAndRetrieveUser() {
        //create a new user and save it
        new User("601647957@qq.com","sectret","Bob").save();
         User bob = User.find("byEmail", "601647957@qq.com").first();
       // Test
        AssertNotNull(bob);
        assertEquals("Bob", bob.fullname);
    }

}
