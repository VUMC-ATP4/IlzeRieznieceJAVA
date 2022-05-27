package homeworkTwo;

public class HomeworkTwo {
    public static void main(String[] args) {

        System.out.println("First task - True/False");

        int x = 6;

        System.out.println(x>0);
        System.out.println(x<0);
        System.out.println((x>5 && x<=10));
        // System.out.println(!(x<5) || !(x = 5) && (x<10));
        // System.out.println(x=0 || x=10);
        System.out.println(x*x>10);

        System.out.println("Second task - print month name based on number");

        int month = 7;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
            default:
                System.out.println("The month" + " " + month + " " + " is not defined");
        }

        System.out.println("Third task - print the biggest value");

            int y = 10;
            int z = 16;
            int w = 21;

            if(y>=z && y>=w) {
                System.out.println(y + " " + "is the largest number");
            }
            else if (z>=y && z>=w){
                System.out.println(z + " " + "is the largest number");
            }
            else{
                System.out.println(w + " " + "is the largest number");
            }

                System.out.println("Forth task - print allowed actions");

        String color = "Orange";
            if (color.equals("Green")) {
                System.out.println("Can continue walking to the" + " " + color + " " + "color");
            }
                else if (color.equals("Red")){
                    System.out.println("Have to wait to the" + " " + color + " " + "color");
                }
                else if (color.equals("Orange")){
                    System.out.println("Have to stop to the" + " " + color + " " + "color");
                }
                else{
                    System.out.println(color + " " + "is not traffic lights color");
                }
            }




        }


