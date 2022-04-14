import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(final String args[]){
        ArrayList<pengumpul> daftar = new ArrayList<>();
        ArrayList<Integer> total = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        tambahData(daftar, total);
        tambahData(daftar, total);
        tambahData(daftar, total);
        tambahData(daftar, total);

        totalBarang(total);

        cariNama("A", daftar);
    }

    public static void cariNama(String name, ArrayList<pengumpul> daftar){
        Collections.sort(daftar);
        int index = Collections.binarySearch(daftar, new pengumpul(null, name, 0));
        
        if(index < 0){
            System.out.println("Nama tidak ditemukan.");
        }else{
            System.out.println("data dari " + name + ": " + "\n" + daftar.get(index));
        }
    }

    public static void totalBarang(ArrayList<Integer> total){
        int index = 0;
        for(int i = 0; i < total.size(); i++){
            index += total.get(i);
        }

        System.out.println("Total berat benda adalah: " + index);
        System.out.println("Total barang yang terkumpul adalah: " + total.size());
    }

    public static void tambahData(ArrayList<pengumpul> daftar, ArrayList<Integer> total){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan ID: ");
        String ID = input.nextLine();
        
        System.out.println("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.println("Masukkan berat benda: ");
        int berat = input.nextInt();

        daftar.add(new pengumpul(ID, nama, berat));
        total.add(berat);
    }
}

