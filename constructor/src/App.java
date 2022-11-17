class Mahasiswa {
    String name;
    String nim;
    String major;


    // constructor called when object first made
    // Mahasiswa() {
        // System.out.println("eyo buddy!");
    // }

    // constructor with parameter
    Mahasiswa(String inputName, String inputNim, String inputMajor) {
        name = inputName;
        nim = inputNim;
        major = inputMajor;

        System.out.println(name);
        System.out.println(nim);
        System.out.println(major);

    }

}

public class App {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Al Azhar", "2241720263", "Information Technology");
        Mahasiswa mahasiswa2 = new Mahasiswa("zharsuke", "2241720123", "Information Technology");

    }
}
