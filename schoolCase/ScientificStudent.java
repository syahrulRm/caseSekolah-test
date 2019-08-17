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
class ScientificStudent extends student {

    int nim;
    String tempatLahir;

    public ScientificStudent(String NamaStudent, String Kelas, int nim) {
        super(NamaStudent, Kelas);
        this.nim = nim;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

}
