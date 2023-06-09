package UltimateFightJava;

public class Backstage implements Actions{
    private String name, nationality, category;
    private int age, victories, defeats, ties;
    private float height, weight;

    public Backstage(String name, String nationality, int age, int victories, int defeats, int ties, float height, float weight) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.victories = victories;
        this.defeats = defeats;
        this.ties = ties;
        this.height = height;
        this.setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if (this.getWeight() < 52.2 || this.getWeight() > 120.2) {
            this.category = "Invalid";
        } else if (this.getWeight() <= 70.3) {
            this.category = "Lightweight";
        } else if (this.getWeight() <= 83.9) {
            this.category = "Middleweight";
        } else if (this.getWeight() <= 120.2) {
            this.category = "Heavyweight";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    @Override
    public void introduce() {
        System.out.println("----------Main event of the evening----------");
        System.out.println("IIIIIt's time!! Introducing the fighter: " + "\nFighter: " + this.getName() +
                "\nOrigin: " + this.getNationality() + "\nAge: " + this.getAge() +
                "\nHeight: " + this.getHeight() + "m" + "\nWeighing: " + this.getWeight() + "\nCategory: " +
                this.getCategory() + "\nWith " + this.getVictories() + " Wins, " + this.getDefeats() +
                " Losses and " + this.getTies() + " Ties!\n");
    }

    @Override
    public void status() {
        System.out.println(this.getName() + " is a " + this.getCategory() + "\nWon " + this.getVictories() + " times." +
                "\nLost " + this.getDefeats() + " times." + "\nTied " + this.getTies() + " times.\n");
    }

    @Override
    public void winFight() {
        this.setVictories(this.getVictories() + 1);
    }

    @Override
    public void loseFight() {
        this.setDefeats(getDefeats() + 1);
    }

    @Override
    public void drawFight() {
        this.setTies(this.getTies() + 1);
    }
}
