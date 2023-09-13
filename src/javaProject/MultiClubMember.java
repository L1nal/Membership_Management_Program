package javaProject;

public class MultiClubMember extends Member {
    private int membershipPoints;
    MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees, int
            pMembershipPoints){
        super(pMemberType, pMemberID, pName, pFees);
        membershipPoints = pMembershipPoints;
    }
    public void setMembershipPoints(int pMembershipPoints){
        membershipPoints = pMembershipPoints;
    }
    public int getMembershipPoints()
    {
        return membershipPoints;
    }
    @Override
    public String toString(){
        return super.toString() + ", " + membershipPoints;
    }
}
