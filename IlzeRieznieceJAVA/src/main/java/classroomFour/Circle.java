package classroomFour;

public class Circle {
    final double PI = 3.14; // final, jo nedrikst mainit
    double radiuss;

  //  Rinkis(){

  //  } tas ir konstruktors

    Circle() {
        System.out.println("Veidoju rinki");

}
Circle(double radiuss){
        this.radiuss = radiuss;
}
    public double laukums(){
        return PI*(radiuss*radiuss);
    }

    public double diametrs(){
        return radiuss+radiuss;
    }
}
