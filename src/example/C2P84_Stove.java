package example;

public class C2P84_Stove {

    public C2P84_Stove() {
        System.out.print("\nChapter 2, page 84: test C2P84_Stove\n##################\n");
        goTest();
    }
    
    public void goTest() {
        Meat meat = new Meat();
        meat = (Meat)heat(meat);
        Soup soup = new Soup();
        soup = (Soup)heat(soup);
    }

    public Object heat(Object food) {
        System.out.println(food + " is done");
        return food;
    }
    
    class Meat {}
    class Soup {}
}
