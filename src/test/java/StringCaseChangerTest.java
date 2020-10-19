import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StringCaseChangerTest extends TestCase {
    @Test
    public void stringCaseChanger() {
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger(drink);
        cc.execute();
        Assert.assertEquals("AbCd", drink.getText());
    }
}