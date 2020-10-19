public class StringInverter implements StringTransformer{

    public String name;
    public StringDrink drink;

    public StringInverter(StringDrink drink) {

        this.drink = drink;
        String[] tempName;
        tempName = this.drink.getText().split("-");
        this.drink.setText(new StringBuilder(tempName[0]).reverse().toString() + "-" + new StringBuilder(tempName[1]).reverse().toString());
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
