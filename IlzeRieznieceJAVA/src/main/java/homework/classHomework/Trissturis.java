package homework.classHomework;

public class Trissturis {
    int a;
    int b;
    int c;
    double laukums;

    boolean irVienādmalu;
    boolean irVienādsānu;

    public Trissturis(){
        System.out.println("Veidojam trīsstūri.");
    }

    public Trissturis (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.laukums = laukums();
    }

    public double laukums (){
        double p = (a+b+c)/2; // Hērona formula, perimetrs
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));    }

    public boolean TrissturisVienadmalu () {
        if ((a == b) && b == c) {
            irVienādmalu = true;
        } else {
            irVienādsānu = false;
        }
        return irVienādmalu;
    }

    public boolean TrissturisVienadsanu() {
        if (a == b && b != c) {
            irVienādsānu = true;
        } else if (a != b && b != c && c == a) {
            irVienādsānu = true;
        }else if (a != b && b == c) {
            irVienādsānu = true;
        }else {
            irVienādsānu = false;
        }
        return irVienādsānu;
    }
    public void printText () {
        System.out.println("Trīsstūra laukums ir " + laukums());
        System.out.println("Trīsstūris ir vienādmalu - " + TrissturisVienadmalu());
        System.out.println("Trīsstūris ir vienādsānu - " + TrissturisVienadsanu());
}
}

