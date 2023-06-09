package UltimateFightJava;

public class Fighters {
    public static void main(String[] args) {
        Backstage[] f = new Backstage[6];
        f[0] = new Backstage("Pretty Boy", "France",  31, 11, 2,
                1, 1.75f, 68.9f );
        f[1] = new Backstage("Putscript", "Brazil",  29, 14, 2,
                3, 1.68f, 57.8f );
        f[2] = new Backstage("Snapshadow", "USA",  35, 12, 2,
                1, 1.65f, 80.9f );
        f[3] = new Backstage("Dead Code", "Australia",  28, 13, 0,
                2, 1.93f, 81.6f );
        f[4] = new Backstage("Ufocobol", "Brazil",  37, 5, 4,
                3, 1.70f, 119.3f );
        f[5] = new Backstage("Nerdaart", "USA",  30, 12, 2,
                4, 1.81f, 105.7f );

        Combat UFJ01 = new Combat();
        UFJ01.scheduleFight(f[0], f[1]);
        UFJ01.toFight();
        f[0].status();
        f[1].status();
    }
}
