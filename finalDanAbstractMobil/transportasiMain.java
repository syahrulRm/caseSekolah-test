/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Syahrul Aceh
 */
public class transportasiMain {

    public static void main(String[] args) {
        motor m = new motor("avansa", "abdul", 1235);
        truck t = new truck("avansa", "muniroh", "truck");

        System.out.println(m.hasil(m));
        m.transportasi1();
        m.transportasi2();
        m.transportasi3();
        
        System.out.println(t.hasil(t));
        t.transportasi1();
        t.transportasi2();
        t.transportasi3();
        
    }
}
