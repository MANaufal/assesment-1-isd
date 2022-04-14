public class pengumpul implements Comparable<pengumpul>{
    String ID;
    String nama;
    int benda;

    public pengumpul(String ID, String nama, int benda){
        this.ID = ID;
        this.nama = nama;
        this.benda = benda;
    }

    public String getNama(){
        return nama;
    }

    @Override
    public String toString(){
        return "ID:" + ID + " nama:" + nama + " berat benda:" + benda;
    }

    public int compareTo(pengumpul o){
        return this.getNama().compareTo(o.getNama());
    }
}
