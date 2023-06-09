package UltimateFightJava;

import java.util.Objects;
import java.util.Random;

public class Combat {

    private Backstage houseChallenger, Challenged;
    private int rounds;
    private boolean approved;

    public void scheduleFight(Backstage f0, Backstage f1) {
        if (Objects.equals(f0.getCategory(), f1.getCategory()) && f0 != f1) {
            this.setApproved(true);
            this.setHouseChallenger(f0);
            this.setChallenged(f1);
        } else {
            this.setApproved(false);
            this.setHouseChallenger(null);
            this.setChallenged(null);
        }
    }

    public void toFight() {
        if (this.isApproved()) {
            this.getHouseChallenger().introduce();
            this.getChallenged().introduce();

            Random dispute = new Random();
            int winner = dispute.nextInt(3);
            System.out.println("--------------- FIGHT RESULT ---------------");
            switch (winner) {
                case 0 -> {
                    System.out.println("Ladies and gentlemen! With a submission, \nthe House Challenger won the fight!");
                    this.getHouseChallenger().winFight();
                    this.getChallenged().loseFight();
                }
                case 1 -> {
                    System.out.println("Ladies and gentlemen! \nThe fight was a draw!");
                    this.getHouseChallenger().drawFight();
                    this.getChallenged().drawFight();
                }
                case 2 -> {
                    System.out.println("Ladies and gentlemen! With a knockout, \nthe Challenged won the fight!");
                    this.getHouseChallenger().loseFight();
                    this.getChallenged().winFight();
                }
            }
            System.out.println("--------------------------------------------");
        } else {
            System.out.println("The fight is not valid.");
        }
    }

    public Backstage getHouseChallenger() {
        return houseChallenger;
    }

    public void setHouseChallenger(Backstage houseChallenger) {
        this.houseChallenger = houseChallenger;
    }

    public Backstage getChallenged() {
        return Challenged;
    }

    public void setChallenged(Backstage challenged) {
        Challenged = challenged;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
