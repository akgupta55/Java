// ---- Type of variable are :-- 

// 1)Local-- within class
// 2)Instance---into the body of class
// 3)class/static---no object required ---- sheared by all objects ---it allocates memory for itself ---it directly linked with class

class variable {
    int n; // instance
    static int m;// static/class;

    void show(int b) {
        int a = 10;// loacal
        System.out.println(a + b);
    }

    int a;

    public static void main(String a[]) {
        variable a1 = new variable();
        variable a2 = new variable();

        a1.n = 20;
        a2.n = 30;

        a1.m = 40;
        System.out.println(a2.m);
        a2.m = 70;
        System.out.println(m);
    }
}
