package cars;

/**
 * @version 03/05/2015
 * @author Steven Matterny
 */
public class Cars {

    private String theName;
    private String theColour;
    private int theYear;

    /**
     *
     * @param Name
     * @param Colour
     * @param Year
     */
    public Cars(String Name, String Colour, int Year) {
        theName = Name;
        theColour = Colour;
        theYear = Year;
    }

    /**
     *
     * @param name1
     */
    public void setName(String name1) {
        theName = name1;
    }

    /**
     *
     * @param colour1
     */
    public void setColour(String colour1) {
        theColour = colour1;
    }

    /**
     *
     * @param year1
     */
    public void setYear(int year1) {
        theYear = year1;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return theName;
    }

    /**
     *
     * @return
     */
    public String getColour() {
        return theColour;
    }

    /**
     *
     * @return
     */
    public int getYear() {
        return theYear;
    }

    public String toString() {
        return "\nName: " + getName()
                + "\nColour: " + getColour()
                + "\nYear: " + getYear();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Cars car1 = new Cars("Ford Focus", "Blue", 2012);

        System.out.println(car1.toString());
    }
}
