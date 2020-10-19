public class StringCaseChanger implements StringTransformer{
    public StringDrink drink;

    public StringCaseChanger(StringDrink drink) {
        this.drink = drink;
    }


    @Override
    public void execute() {
        String name_drink = drink.getText();
        StringBuilder sb = new StringBuilder(name_drink);
        for (int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if(Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }else{
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        }
        drink.setText(sb.toString());

    }
}
