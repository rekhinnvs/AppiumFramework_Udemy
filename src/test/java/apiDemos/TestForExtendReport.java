package apiDemos;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestForExtendReport {
    @Test(description = "From login page")
    public void testLogin() {
        System.out.println("From login");

    }

    @Test
    public void testUsers() {
        System.out.println("From Users");
        throw new SkipException("This test case is skipped");

    }

    @Test
    public void testDatabase() {
        System.out.println("From Databas");

    }

    @Test
    public void testSecurity() {
        System.out.println("From Security");
        Assert.fail();

    }

    @Test
    public void testPersonal() {
        System.out.println("From Personal");
        Assert.assertEquals(true,false);

    }

    @Test
    public void testSecure() {
        System.out.println("From Secure");

    }

    @Test
    public void testLogout() {
        System.out.println("From Logout");

    }

}
