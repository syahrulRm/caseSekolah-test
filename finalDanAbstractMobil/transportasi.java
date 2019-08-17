/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Syahrul Aceh
 */
abstract class transportasi {
    String namaTransportasi;
    String pemilik;
    int numErrors = 0;
    
    transportasi (String n, String p){
        this.namaTransportasi = n; this.pemilik = p;
    }
    final public void anotherErrors(){
        numErrors++;
    }
    final public int getNumErrors(){
        return numErrors;
    }
    abstract public void transportasi1();
    abstract public void transportasi2();
    abstract public void transportasi3();
}
