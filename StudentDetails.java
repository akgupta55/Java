public class StudentDetails {
    String name;
    int age;
    Address address;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setAddress(Address add) {
        this.address = add;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    Address getAddress() {
        return this.address;
    }

    public static void main(String ar[]) throws java.lang.Exception {
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();
        StudentDetails s3 = new StudentDetails();

        Address a1 = new Address("Varanasi", "UttarPradesh", 2201101);
        Address a2 = new Address("Kanpur", "UttarPradesh", 2101105);
        Address a3 = new Address("Jaipur", "Rajeshthhan", 550322);

        s1.setName("Ajay");
        s2.setName("Jay");
        s3.setName("Raj");
        s1.setAge(22);
        s2.setAge(20);
        s3.setAge(24);
        s1.setAddress(a1);
        s1.setAddress(a2);
        s1.setAddress(a3);

        System.out.println("Student 1 details :\nName:-" + s1.getName() + "\nAge:-" + s1.getAge() + "\nAddress:-"
                + s1.getAddress().city);
        System.out.println("\nStudent 2 details :\nName:-" + s2.getName() + "\nAge:-" + s2.getAge() + "\nAddress:-"
                + s2.getAddress().city);
        System.out.println("\nStudent 3 details :\nName:-" + s3.getName() + "\nAge:-" + s3.getAge() + "\nAddress:-"
                + s3.getAddress().city);
        int arr[] = { s1.getAge(), s2.getAge(), s3.getAge() };

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; ++i) {
            maxValue = Math.max(maxValue, arr[i]);
        }
        System.out.println("\nMaximum age is " + maxValue);

    }

}

class Address {
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}