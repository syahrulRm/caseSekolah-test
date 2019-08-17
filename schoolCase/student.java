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
public class student {
    String NamaStudent;
    String Kelas;
    

     student(String NamaStudent, String Kelas) {
        this.NamaStudent = NamaStudent;
        this.Kelas = Kelas;
    }

    
    public String Student1() {
        return "student \n" + "NamaStudent=" + NamaStudent + "\n Kelas=" + Kelas ;
    }
    
    class SosialStudent extends student {
        String hobi;

        SosialStudent(String NamaStudent, String Kelas, String hobi) {
            super(NamaStudent, Kelas);
            this.hobi = hobi;
        }
        public String getHobi() {
            return hobi;
        }

        public void setHobi(String hobi) {
            this.hobi = hobi;
        }

    }
}
