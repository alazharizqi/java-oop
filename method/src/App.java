class Mahasiswa {
    String name;
    String nim;

    Mahasiswa(String name, String nim) {

        // this. used to called variable from class, not from parameter

        this.name = name;
        this.nim = nim;

        System.out.println(this.name);
        System.out.println(this.nim);

    }

    // method without return and without parameter
    void show() {
        System.out.printf("Name : %s\n", this.name);
        System.out.printf("NIM : %s\n", this.nim);
    }

    // method without return and with parameter
    void setName(String name) {
        this.name = name;
    }

    //method with return and without parameter
    String getName() {
        return this.name;
    }
    String getNIM() {
        return this.nim;
    }

    // method with return and with parameter
    String sayHi(String message) {
        return message + " my name is " + this.name;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Al Azhar", "2241720263");

        mahasiswa1.show();
        mahasiswa1.setName("zharsuke");
        mahasiswa1.show();
        System.out.println(mahasiswa1.getName());
        System.out.println(mahasiswa1.getNIM());
        System.out.println(mahasiswa1.sayHi("hello buddy,"));

    }
}
