class mahasiswa{
String nama;
String NIM;
String jurusan;
double IPK;
int umur;
}






public class Class_Object {
    public static void main(String[] args) {
        
        //instansiasi / membuat object
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nama = "ucup";
        mahasiswa1.NIM = "13305041";
        mahasiswa1.jurusan = "teknik perteknikan";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nama = "Otong";
        mahasiswa2.NIM = "13305041";
        mahasiswa2.jurusan = "teknik perteknikan";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 32;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}
