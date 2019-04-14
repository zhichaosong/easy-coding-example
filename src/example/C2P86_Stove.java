package example;

public class C2P86_Stove {

    public C2P86_Stove() {
        System.out.print("\nChapter 2, page 86: test C2P86_Stove\n##################\n");
        goTest();
    }
    
    public void goTest() {
        Meat meat = new Meat();
        meat = heat(meat);
        Soup soup = new Soup();
        soup = heat(soup);
    }

    public <T> T heat(T food) {
        System.out.println(food + " is done");
        return food;
    }
    
    class Meat {}
    class Soup {}
}
