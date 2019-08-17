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
class IoSerialBoard extends IoBoard {

    int port;

    public IoSerialBoard(String s, int p) {
        super(s);
        port = p;
        System.out.println("IoSerialBoard constructor");
    }

    public void inisial() {
        System.out.println("inisial method in IoSerialBoard");
    }

    public void read() {
        System.out.println("Read method in IoSerialBoard");
    }

    public void write() {
        System.out.println("Write Method In IoSerialBoard");
    }

    public void close() {
        System.out.println("Close Method In IoSerialBoard");
    }
}
