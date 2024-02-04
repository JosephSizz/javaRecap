package edu.sjsu.cs;

public class Candidate {

    private int candidateId;
    //private String name;
    private String party;

    private String firstName;

    private String lastName;


    Candidate(int candidateId, String firstName, String lastName, String party) {

        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;

    }


    public int getCandidateId() {
        return candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getParty() {
        return party;
    }

    public String getFormatName() {
        return (firstName + " " + lastName).toUpperCase();
    }

    public void printInfo() {
        Utility.printCandidateInfo(this);
    }



    //the ? is a replacement for shoudl be actually data for it, this being int. Or it rather be private
}
