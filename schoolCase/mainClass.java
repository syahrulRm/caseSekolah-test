/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolCase;

import java.util.Scanner;

/**
 *
 * @author Syahrul Aceh
 */
public class mainClass {

    public static void main(String[] args) {
        String NMDosen;
        int UmurDosen;
        String AsalDosen;

        String NamaStudent;
        String Kelas;
        int nim;
        String hobi;
        String TempatLahir;

        int nilaiKkmMatematika;
        int nilaiTerbaikMatematika;
        int nilaiKkmEkonomi;
        int nilaiTerbaikEkonomi;

        Scanner input = new Scanner(System.in);
        System.out.println("silahkan isikan nama guru");
        NMDosen = input.next();
        System.out.println("\n"
                + "silahkan isikan umur guru");
        UmurDosen = input.nextInt();
        System.out.println("\n"
                + "silahkan isikan asal guru");
        AsalDosen = input.next();
        teacher teacher = new teacher(NMDosen, UmurDosen, AsalDosen);
        System.out.println(teacher.DataGuru(teacher));

        System.out.println("\n"
                + "siapa nama anda : ");
        NamaStudent = input.next();
        System.out.println("\n"
                + "silahkan anda pilih kelasnya : \n -matematika \n -ekonomi");
        Kelas = input.next();
        System.out.println("\n"
                + "berapa nim anda :");
        nim = input.nextInt();
        System.out.println("\n"
                + "tempat lahir :");
        TempatLahir = input.next();
        System.out.println("\n"
                + "hobi anda :");
        hobi = input.next();
        student s = new student(NamaStudent, Kelas);

        System.out.println(s.Student1());

        ScientificStudent ss = new ScientificStudent(NamaStudent, Kelas, nim);
        ss.setTempatLahir(TempatLahir);

        if (NMDosen.equals(NMDosen.trim())) {

            try {
                 
                if (Kelas.equals("matematika")) {
                    System.out.println("masukan nilai matematika anda : ");
                    nilaiKkmMatematika = input.nextInt();
                    System.out.println("masukan nilai matematika terbaik anda : ");
                    nilaiTerbaikMatematika = input.nextInt();
                    matematika matematika = new matematika(nilaiKkmMatematika, nilaiTerbaikMatematika);
                    System.out.println("Data Siswa");
                    System.out.println("\n"+NamaStudent
                            + "\n" + Kelas
                            + "\n" + nim
                            + "\n" + TempatLahir
                            + "\n" + hobi);
                    System.out.println(matematika.nilaiMatematika());
                    System.out.println(teacher.DataGuru(teacher));
                    System.out.println("========================================================");
                    
                }
                if (Kelas.equals("ekonomi")) {
                    System.out.println("masukan nilai Ekonomi anda : ");
                    nilaiKkmEkonomi = input.nextInt();
                    System.out.println("masukan nilai Ekonomi terbaik anda : ");
                    nilaiTerbaikEkonomi = input.nextInt();
                    System.out.println("\n"+NamaStudent
                            + "\n" + Kelas
                            + "\n" + nim
                            + "\n" + TempatLahir
                            + "\n" + hobi);
                    System.out.println("nilai ekonomi :\n"+nilaiKkmEkonomi + "\n" +"nilai terbaik ekonomi :\n"+ nilaiTerbaikEkonomi);
                    System.out.println(teacher.DataGuru(teacher));
                    System.out.println("========================================================");
                }
                

            } catch (Exception e) {
            }
        }

    }
}
