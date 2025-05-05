public class MemberInfo {
    private int graduationYear;
    private boolean isInGoodStanding;
    private String memberName;

    public MemberInfo(String name, int year, boolean goodStatus) {
        memberName = name;
        graduationYear = year;
        isInGoodStanding = goodStatus;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public boolean hasGoodStanding() {
        return isInGoodStanding;
    }

    public String toString() {
        return "\nName: " + memberName + "\n" +
               "Year: " + graduationYear + "\n" +
               "Good Standing: " + isInGoodStanding + "\n";
    }
}