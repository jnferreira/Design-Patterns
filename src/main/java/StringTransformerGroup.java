import java.util.ArrayList;
import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    public List<StringTransformer> transformers = new ArrayList<>();

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public List<StringTransformer> getTransformers() {
        return transformers;
    }

    public void setTransformers(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    @Override
    public void execute() {

    }
}
