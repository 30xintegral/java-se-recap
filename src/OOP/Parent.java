package OOP;

public class Parent {
    protected String p="p";
    private char d;
    public Parent(String p) {
        System.out.println("parent");
    }

    public Parent(String p, char d) {
        this.p = p;
        this.d = d;
    }
    public Parent(char d) {

    }
}
