package codePackage;

public class ObjectTester {

    int x;
    final int y;

    public ObjectTester(int x, int y) {
        this.y = -6;
        this.x = x;
    }

    ObjectTester inTest() {
        ObjectTester test = new ObjectTester(10, 20);
        return test;
    }

    ObjectTester moreInTest() {
        ObjectTester test = new ObjectTester(30, 20);
        return test;
    }

    public int showSummation() {
        return x + y;
    }
}
