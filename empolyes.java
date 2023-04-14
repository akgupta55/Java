import java.util.*;

// inhertance

class empolyes extends Person {
    String empid, depart;
    int salary;

    void inputEmp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Empolyes details :--");
        System.out.println("Enter Empolyes name :--");
        name = sc.nextLine();
        System.out.println("Enter Empolyes address :--");
        address = sc.nextLine();
        System.out.println("Enter Empolyes Empolye id :--");
        empid = sc.nextLine();
        System.out.println("Enter Empolyes Date of birth :--");
        dob = sc.nextInt();
        System.out.println("Enter Empolyes mobile number :--");
        mno = sc.nextLong();
        sc.close();
    }

    public static void main(String ar[]) {
        empolyes e1 = new empolyes();
        e1.inputEmp();
        System.out.println(e1.name);
        System.out.println(e1.address);
        System.out.println(e1.dob);
        System.out.println(e1.mno);
    }
}
