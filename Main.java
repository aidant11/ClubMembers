import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MemberInfo[] sampleData = {
            new MemberInfo("SMITH, JANE", 2019, false),
            new MemberInfo("FOX, STEVE", 2018, true),
            new MemberInfo("XIN, MICHAEL", 2017, false),
            new MemberInfo("GARCIA, MARIA", 2020, true)
        };

        ArrayList<MemberInfo> clubRoster = new ArrayList<>();
        for (int i = 0; i < sampleData.length; i++) {
            clubRoster.add(sampleData[i]);
        }

        ClubMembers club = new ClubMembers(clubRoster);

        System.out.println(club.removeGraduatedMembers(2018));
        System.out.println(club.getMemberList());
    }
}