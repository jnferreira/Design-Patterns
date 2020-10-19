public class StringReplacer implements StringTransformer{
    public StringDrink drink;
    public Character oldchar;
    public Character newchar;

    public StringReplacer(StringDrink drink, Character oldchar, Character newchar) {
        this.drink = drink;
        this.oldchar = oldchar;
        this.newchar = newchar;
        this.drink.setText(this.drink.getText().replace(this.oldchar, this.newchar));
    }

    @Override
    public void execute() {
        this.drink.setText(this.drink.getText().replace(this.oldchar, this.newchar));
    }
}
