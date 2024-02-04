package edu.sjsu.cs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Candidate candidate = new Candidate(1, "joseph", "hawkins", "coolParty");
        candidate.printInfo();

        Voter voter = new Voter(12, "luffy", "monkey", true);
        voter.printInfo();
    }
}