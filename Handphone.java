/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166008_pbo_lat55;

/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* Matkul    : PBO
**/
//kelas Handphone
public class Handphone {
    //variabel 
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;
    //konstruktor
    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    //metode displayProduct untuk menampilkan informasi produk handphone.
    public void displayProduct() {
        System.out.println("Manufaktur : " + manufacture);
        System.out.println("OS : " + operatingSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }
}
//kelas Android kelas turunan dari kelas Handphone
class Android extends Handphone {
    //variabel
    private String keystore;
    //konstruktor
    public Android(String man, String os, String model, int harga, String keystore) {
        super(man, os, model, harga);
        this.keystore = keystore;
    }
    //metode get 
    public String getKeyStore() {
        return keystore;
    }
    //metode set
    public void setKeyStore(String keyStore) {
        this.keystore = keyStore;
    }
}
//kelas BlackBerry turunan dari kelas Handphone
class BlackBerry extends Handphone {
    //variabel 
    private String pinBB;
    //konstruktor
    public BlackBerry(String man, String os, String model, int harga, String pinBB) {
        super(man, os, model, harga);
        this.pinBB = pinBB;
    }
    //metode get
    public String getPinBB() {
        return pinBB;
    }
    //metode set
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}
//kelas Windows turunan dari kelas Handphone
class WindowsPhone extends Handphone {
    //variabel
    private String wpkeyStore;
    //konstruktor
    public WindowsPhone(String man, String os, String model, int harga, String wpKeyStore) {
        super(man, os, model, harga);
        this.wpkeyStore = wpKeyStore;
    }
    //metode get
    public String getWpKeyStore() {
        return wpkeyStore;
    }
    //metode set
    public void setWpKeyStore(String wpKeyStore) {
        this.wpkeyStore = wpKeyStore;
    }
    //metode menjalankan program
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000, "234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());

        BlackBerry blackberry = new BlackBerry("BlackB", "RIM", "Curve", 2000000, "BHS249");
        blackberry.displayProduct();
        System.out.println("PIN : " + blackberry.getPinBB());

        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Wins", "Lumia", 1000000, "UUUQIJWORJ");
        windowsPhone.displayProduct();
        System.out.println("WP Key Store : " + windowsPhone.getWpKeyStore());
    }
    
}
