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
public class Class {
    String mataPelajaran;
    
}
class matematika{
    int nilaiKKM1;
    int nilaiTerbaik1;

    public matematika(int nilaiKKM1, int nilaiTerbaik1) {
        this.nilaiKKM1 = nilaiKKM1;
        this.nilaiTerbaik1 = nilaiTerbaik1;
    }

    
    public String nilaiMatematika() {
        return "matematika \n" 
                + "\n nilaiKKM=" 
                + nilaiKKM1 
                + "\n nilaiTerbaik=" 
                + nilaiTerbaik1 ;
    }
    
    
    
class ekonomi{
    int nilaiKKM2;
    int nilaiTerbaik2;

        public ekonomi(int nilaiKKM2, int nilaiTerbaik2) {
            this.nilaiKKM2 = nilaiKKM2;
            this.nilaiTerbaik2 = nilaiTerbaik2;
        }

        public String nilaiEkonomi() {
            return "ekonomi \n" 
                + "\n nilaiKKM=" 
                + nilaiKKM2
                + "\n nilaiTerbaik=" 
                + nilaiTerbaik2 ;
        }
    }
}
