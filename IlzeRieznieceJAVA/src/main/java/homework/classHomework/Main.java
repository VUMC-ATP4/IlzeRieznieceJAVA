package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trissturis trissturis1 = new Trissturis();
        trissturis1.a = 8;
        trissturis1.b = 8;
        trissturis1.c = 8;

        Trissturis trissturis2 = new Trissturis(8,5,10);

        trissturis1.printText();
        trissturis2.printText();

    }

}