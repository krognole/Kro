package exo4;

public class Town {
    protected static int numberOfHouse;
    public Town(){}

    public void displaynumberOfHouse(){
        if (numberOfHouse <=1) {
            System.out.println("In this Town there are " + numberOfHouse + " house");
        }
        else {
            System.out.println("In this Town there are " + numberOfHouse + " houses");
        }
    }
}
