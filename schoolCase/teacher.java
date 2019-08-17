/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolCase;



/**
 *
 * @author Syahrul Aceh
 */
 class teacher {
    String nama;
    int umur;
    String asal;

    teacher(String nama, int umur, String asal) {
        this.nama = nama;
        this.umur = umur;
        this.asal = asal;
    }

    public String DataGuru(teacher DataGuru) {
        return  "\n dosen pebimbing"+"\n nama =" + nama + "\n umur =" + umur + " \n asal =" + asal + "\n";
    }
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
    
}
