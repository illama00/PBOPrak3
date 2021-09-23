package PBOgetset ;

class buku {
    String Judul ;
    String Jenis ;
    int Harga ;
    int Halaman ;
    String ISBN ;
    int Tahun ;

    public String getJudul() {
        return Judul ;
    }
    public void setJudul(String Judul) {
        this.Judul = Judul ;
    }

    public String getJenis() {
        return Jenis ;
    }
    public void setJenis(String Jenis) {
        this.Jenis = Jenis ;
    }

    public int getHarga() {
        return Harga ;
    }
    public void setHarga(int Harga) {
        this.Harga = Harga ;
    }

    public int getHalaman() {
        return Halaman ;
    }
    public void setHalaman(int Halaman) {
        this.Halaman = Halaman ;
    }

    public String getISBN() {
        return ISBN ;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN ;
    }

    public int getTahun() {
        return Tahun ;
    }
    public void setTahun(int Tahun) {
        this.Tahun = Tahun ;
    }
    
    //@Override
    public String toString() {
        String str = "Buku       |Judul = " + getJudul() + "|Jenis = " + getJenis() + "|Harga = " + getHarga() + "|Tebal = " + getHalaman() + "|ISBN = " + getISBN() + "|Tahun Terbit = " + getTahun() + "|" ;
        return str ;
    }
}

class penulis {
    String Nama ;
    int Id ;
    char Gender ;
    String Email ;

    public String getNama() {
        return Nama ;
    }
    public void setNama(String Nama) {
        this.Nama = Nama ;
    }
    
    public int getId () {
        return Id ;
    }
    public void setId(int Id) {
        this.Id = Id ;
    }

    public char getGender() {
        return Gender ;
    }
    public void setGender(char Gender) {
        this.Gender = Gender ;
    }

    public String getEmail() {
        return Email ;
    }
    public void setEmail( String Email) {
        this.Email = Email ;
    }
    public String toString() {
        String str = "Penulis    |Nama + " + getNama() + "|Id = " + getId() + "|Gender = " + getGender() + "|Email = " + getEmail() + "|" ;
        return str ;
    }
    
}

public class Book {
    public static void main(String [] args) {
        buku b = new buku () ;
        b.setJudul("ABC") ;
        b.setJenis("pendidikan") ;
        b.setHarga(18000) ;
        b.setHalaman(123) ;
        b.setISBN("ISBN 978-6-93-9") ;
        b.setTahun(2007) ;

        penulis p = new penulis () ;
        p.setNama("Messi") ;
        p.setId(223) ;
        p.setGender('L') ;
        p.setEmail("Messii@mail.com") ;

        System.out.println(b.toString()) ;
        System.out.println(p.toString()) ;
    }
}
