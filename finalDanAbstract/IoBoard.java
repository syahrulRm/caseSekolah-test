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
abstract class IoBoard {
    String name;
    int numErrors = 0;
    
    IoBoard (String s) {
        System.out.println("Ioboard constructor");
        name = s;
    }
    final public void anotherError(){
        numErrors++;
    }
    final public int getNumErrors(){
        return numErrors;
    }
    abstract public void inisial();
    abstract public void read();
    abstract public void write();
    abstract public void close();
}
