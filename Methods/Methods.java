package Methods;
class Mahasiswa{
    //Data member
    String nama;
    String NIM;

    //constructur
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;         
    }

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    //method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //method demham return dan tidak ada parameter
    String getNama(){
      return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    //method dengan return dan dengan parameter
    String sayHi(String messege){
        return messege + " juga, nama saya adalah " + this.nama;
    }

}



public class Methods {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "123332113");
        System.out.println(mahasiswa1.nama);
        //method
        mahasiswa1.show();
        mahasiswa1.setNama("tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
    
    }
}

