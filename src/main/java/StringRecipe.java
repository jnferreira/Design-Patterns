import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringRecipe {
    public List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void mix() {
        Collections.shuffle(this.transformers);
    }
}
