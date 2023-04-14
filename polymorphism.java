class Method {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add() {
        int a = 10, b = 20;
        System.out.println(a - b);
    }
}

class polymorphism {
    public static void main(String a[]) {
        Method m = new Method();
        m.add();
        m.add(20, 30);
    }

}
