import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringInverter implements StringTransformer{

    public String name;
    public StringDrink drink;

    public StringInverter(StringDrink drink) {

        this.drink = drink;
        String[] tempName;

        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(this.drink.getText());
        boolean b = m.find();

        if (b){
            tempName = this.drink.getText().split("-");
            this.drink.setText(new StringBuilder(tempName[0]).reverse().toString() + "-" + new StringBuilder(tempName[1]).reverse().toString());
        }else{
            this.drink.setText(new StringBuilder(this.drink.getText()).reverse().toString());
        }


    }

    @Override
    public void execute() {

    }

    public StringDrink getDrink() {
        return drink;
    }

    public void setDrink(StringDrink drink) {
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
