public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    double matAvg;
    double kimAvg;
    double fizAvg;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addVerbalExamNote(int matVerbal, int fizikVerbal, int kimyaVerbal) {

        if (matVerbal >= 0 && matVerbal <= 100) {
            this.mat.verbalNote = matVerbal;
        }

        if (fizikVerbal >= 0 && fizikVerbal <= 100) {
            this.fizik.verbalNote = fizikVerbal;
        }

        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) {
            this.kimya.verbalNote = kimyaVerbal;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.verbalNote == 0 || this.fizik.verbalNote == 0 || this.kimya.verbalNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + (int)this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        avgNotes();
        this.avarage = (this.matAvg + this.fizAvg + this.kimAvg) / 3;
    }


    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void avgNotes() {
        this.matAvg = (this.mat.note * 0.8) + (this.mat.verbalNote * 0.2);
        this.fizAvg = (this.fizik.note * 0.8) + (this.fizik.verbalNote * 0.2);
        this.kimAvg = (this.kimya.note * 0.8) + (this.kimya.verbalNote * 0.2);
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        avgNotes();
        System.out.println("Matematik Yazili Notu : " + this.mat.note + " / Matematik Sözlü Notu : " + this.mat.verbalNote + " / Matematik Dersi Ortalama Notu : " + this.matAvg);
        System.out.println("Fizik Yazili Notu : " + this.fizik.note + " / Fizik Sözlü Notu : " + this.fizik.verbalNote + " / Fizik Dersi Ortalama Notu : " + this.fizAvg);
        System.out.println("Kimya Yazili Notu : " + this.kimya.note + " / Kimya Sözlü Notu : " + this.kimya.verbalNote + " / Kimya Dersi Ortalama Notu : " + this.kimAvg);
    }
}
