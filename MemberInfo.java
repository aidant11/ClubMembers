import javax.xml.transform.stax.StAXResult;

public class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) 
    {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    /** Returns the graduation year of the club member. */
    public int getGradYear() {
        /* implementation not shown */ }


    /** Returns true if the member is in good standing and false otherwise. */
    public boolean inGoodStanding() {
        /* implementation not shown */ }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}
