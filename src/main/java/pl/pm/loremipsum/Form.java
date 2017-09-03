package pl.pm.loremipsum;

public class Form {
    private int number;
    private int option;
    private int textoption;
    private boolean html;

    public boolean isHtml() {
        return html;
    }

    public void setHtml(boolean html) {
        this.html = html;
    }

    public Form(){}

    public Form(int number, int option) {
        this.number = number;
        this.option = option;
    }

    public int getTextoption() {
        return textoption;
    }

    public void setTextoption(int textoption) {
        this.textoption = textoption;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }


    public static void isLorem(){

    }
}
