
// class as template
class Mahasiswa{

    String name;
    String nim;
    String class_;
    String study_program;
    String major;
    String instance;

}


public class App {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa(); // new object from class

        mahasiswa1.name = "AL AZHAR RIZQI RIFA'I FIRDAUS";
        mahasiswa1.nim = "2241720263";
        mahasiswa1.class_ = "1 I";
        mahasiswa1.study_program = "Informatic Engineering";
        mahasiswa1.major = "Information Technology";
        mahasiswa1.instance = "State Polytechnic of Malang";

        System.out.println(mahasiswa1.name);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.class_);
        System.out.println(mahasiswa1.study_program);
        System.out.println(mahasiswa1.major);
        System.out.println(mahasiswa1.instance);

        System.out.println();

        Mahasiswa mahasiswa2 = new Mahasiswa(); // new object from class

        mahasiswa2.name = "zharsuke";
        mahasiswa2.nim = "2241720362";
        mahasiswa2.class_ = "1 I";
        mahasiswa2.study_program = "Informatic Engineering";
        mahasiswa2.major = "Information Technology";
        mahasiswa2.instance = "State Polytechnic of Malang";

        System.out.println(mahasiswa2.name);
        System.out.println(mahasiswa2.nim);
        System.out.println(mahasiswa2.class_);
        System.out.println(mahasiswa2.study_program);
        System.out.println(mahasiswa2.major);
        System.out.println(mahasiswa2.instance);

    }
}
