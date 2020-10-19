import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StringRecipeTest{
    @Test
    public void stringRecipe() {
        StringDrink drink = new StringDrink("AbCd-aBcD");

        StringInverter si = new StringInverter(drink);
        StringCaseChanger cc = new StringCaseChanger(drink);
        StringReplacer sr = new StringReplacer(drink, 'A', 'X');

        List<StringTransformer> transformers = new ArrayList<>();
        transformers.add(si);
        transformers.add(cc);
        transformers.add(sr);

        StringRecipe recipe = new StringRecipe(transformers);
        recipe.mix();

        Assert.assertEquals("dCbX-DcBa", drink.getText());
    }
}