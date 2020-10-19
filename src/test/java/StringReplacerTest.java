import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StringReplacerTest {

    @Test
    public void stringReplacer() {
        StringDrink drink = new StringDrink("ABCDABCD");
        StringReplacer sr = new StringReplacer(drink, 'A', 'X');
        sr.execute();
        Assert.assertEquals("XBCDXBCD", drink.getText());
    }

}