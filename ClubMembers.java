import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> members;

    public ClubMembers(ArrayList<MemberInfo> initialList) {
        members = initialList;
    }

    public void addNewMembers(String[] newNames, int year) {
        for (String fullName : newNames) {
            members.add(new MemberInfo(fullName, year, true));
        }
    }

    public ArrayList<MemberInfo> removeGraduatedMembers(int targetYear) {
        ArrayList<MemberInfo> graduatedGoodStanding = new ArrayList<>();

        for (int idx = 0; idx < members.size(); idx++) {
            MemberInfo current = members.get(idx);
            if (current.getGraduationYear() <= targetYear) {
                if (current.hasGoodStanding()) {
                    graduatedGoodStanding.add(current);
                }
                members.remove(idx);
                idx--; // adjust index after removal
            }
        }

        return graduatedGoodStanding;
    }

    public ArrayList<MemberInfo> getMemberList() {
        return members;
    }
}
