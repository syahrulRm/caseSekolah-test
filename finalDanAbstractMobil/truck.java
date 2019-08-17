/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Syahrul Aceh
 */
class truck extends transportasi {
    String jenis;
    public truck(String n, String p, String j) {
        super(n, p);
        this.jenis = j;
        
    }
    public String hasil (truck t) {
        return t.namaTransportasi 
                +"\n"+ t.pemilik 
                +"\n"+ t.jenis;
    }
    
    public void transportasi1() {
        System.out.println("...");
    }

    
    public void transportasi2() {
        System.out.println("...");
    }

    
    public void transportasi3() {
        System.out.println("...");
    }
    
}
