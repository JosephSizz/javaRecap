package edu.sjsu.cs;

public class Voter {

    private int voterId;
    private String name;
    boolean hasVoted;


    private String firstName;
    private String lastName;



    public Voter(int voterId, String firstName, String lastName, boolean hasVoted){

        this.voterId = voterId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hasVoted = hasVoted;
    }

    public boolean getVoted() {
        return hasVoted;
    }


    public String getName() {
        return name;
    }


    public int getVoterId() {
        return voterId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFormatName() {
        return (firstName + " " + lastName).toUpperCase();
    }
    public void printInfo() {
        Utility.printVoterInfo(this);
    }

}
