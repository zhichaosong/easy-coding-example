package example;

public class C2P80_Father {
    protected void doSomething() {
        System.out.println("Father's doSomething");
        // java.lang.StackOverflowError
        this.doSomething();
    }

    public C2P80_Father() {
        System.out.print("\nChapter 2, page 80: test Father doSomething\n##################\n");
        C2P80_Father father = new Son();
        father.doSomething();
    }
}

class Son extends C2P80_Father {
    @Override
    public void doSomething() {
        System.out.println("Son's doSomething");
    }
}
