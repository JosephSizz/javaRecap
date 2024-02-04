package edu.sjsu.cs;
public class Utility {

    public static void printCandidateInfo(Candidate candidate) {
        System.out.println("Candidate Information:");
        System.out.println("ID: " + candidate.getCandidateId());
        System.out.println("Name: " + candidate.getFormatName());
        System.out.println("Party: " + candidate.getParty());
        System.out.println();

    }


    public static void printVoterInfo(Voter voter) {
        System.out.println("Voter Information:");
        System.out.println("ID: " + voter.getVoterId());
        System.out.println("Name: " + voter.getFormatName());
        System.out.println("has voted:" + voter.getVoted());
        System.out.println();

    }

}
