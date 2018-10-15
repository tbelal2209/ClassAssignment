package TazwarBelal;

public class Person {
    private String name;
    private String cell;

    public Person(String theName, String theCell) {
        this.name = theName;
        this.cell = theCell;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String theName)
    {
        this.name = theName;
    }

    public String getCell()
    {
        return this.cell;
    }

    public void setCell(String theCell)
    {
        this.cell = theCell;
    }

    public String toString() {
        return "name: " + this.name +
            ", cell: " + this.cell;
    }


    }

