class Method {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }
}

class method_overloading {
    public static void main(String a[]) {
        Method m = new Method();
        System.out.println(m.add(10, 20));
        System.out.println(m.sub(20, 10));
    }
}
