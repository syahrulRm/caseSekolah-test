/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Syahrul Aceh
 */
class motor extends transportasi {
    int nomerPlat;
    public motor(String n,String p, int mm) {
        super(n,p); this.nomerPlat = mm;
       
    }
     public String hasil (motor m) {
        return m.namaTransportasi 
                +"\n"+ m.pemilik 
                +"\n"+ m.nomerPlat;
     }

    
    public void transportasi1() {
        System.out.println(".....");
    }

    
    public void transportasi2() {
        System.out.println(".....");
    }

    
    public void transportasi3() {
        System.out.println(".....");
    }
    
}
