import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BarTest {
    @Test
    public void happyHour() {
        Bar bar = new StringBar();
        Assert.assertFalse(bar.isHappyHour());

        bar.startHappyHour();
        Assert.assertTrue(bar.isHappyHour());

        bar.endHappyHour();
        Assert.assertFalse(bar.isHappyHour());
    }
}