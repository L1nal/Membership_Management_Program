package javaProject;

public class Member {
    char memberType;
    int memberID;
    String name;
    double fees;
    Member(char pMemberType, int pMemberID, String pName, double pFees){
        memberType = pMemberType;
        memberID = pMemberID;
        name = pName;
        fees = pFees;
    }
    public void setMemberType(char pMemberType)
    {
        memberType = pMemberType;
    }
    public char getMemberType()
    {
        return memberType;
    }
    public void setMemberID(int pMemberID)
    {
        memberID = pMemberID;
    }
    public int getMemberID()
    {
        return memberID;
    }
    public void setName(String pName)
    {
        name = pName;
    }
    public String getName()
    {
        return name;
    }
    public void setFees(double pFees)
    {
        fees = pFees;
    }
    public double getFees()
    {
        return fees;
    }
    @Override
    public String toString(){
        return memberType + ", " + memberID + ", " + name + ", " + fees;
    }
}
