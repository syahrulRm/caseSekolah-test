/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalDanAbstract;

/**
 *
 * @author Syahrul Aceh
 */
class IoEthernetBoard extends IoBoard {

    long networkAddress;

    public IoEthernetBoard(String s, long netAdd) {
        super(s);
        networkAddress = netAdd;
        System.out.println("IoEthernetBoard constructor");
    }

    public void inisial() {
        System.out.println("Inisial method in IoEthernetBoard");
    }

    public void read() {
        System.out.println("read method in IoEthernetBoard");
    }

    public void write() {
        System.out.println("read method in IoEthernetBoard");
    }

    public void close() {
        System.out.println("Read method in IoEthernetBoard");
    }

}
