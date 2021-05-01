public class Main {
        //method main
        
        public static void main(String[] args) {
            
            //membuat objek baru atau dari class user
            Mahasiswa irfan = new Mahasiswa();
            
            // menggunakan method setter(isi)
            //insialisasi method dari objek irfan
            irfan.setName("Muhammad Irfan Fachrulrozy Hakim");
            irfan.setGrade("A");
            irfan.setMajor("Informatika");
            irfan.setFaculty("Fakultas : Teknik ");
            irfan.setNIM("NIM : 202010370311019");
            
            // menggunakan method getter(ambil)
            //construktor 
            System.out.println("Nama : " + irfan.getName());    
            System.out.println("Kelas : " +irfan.getGrade()); 
            System.out.println("Jurusan :" +irfan.getMajor());
            System.out.println("Fakultas :"+irfan.getFaculty());
            System.out.println("NIM :"+irfan.getNIM());
            }
    }
    
