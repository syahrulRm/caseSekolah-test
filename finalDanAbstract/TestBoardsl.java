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
public class TestBoardsl {
    public static void main(String[] args) {
        IoSerialBoard serial = new IoSerialBoard ("my first port",0x2f8);
        
        serial.inisial();
        serial.read();
        serial.close();
    }
}
