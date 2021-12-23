package ro.fasttrackit.curs12;

import static ro.fasttrackit.curs12.PuncteCardinale.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(NORD);
        System.out.println(SUD.toDirection());
        System.out.println(EST.toDirection());
        System.out.println(VEST.name()); //name e metoda default a lui enum
        System.out.println(VEST.getPrescurtare());

        System.out.println(NORD.ordinal()); //al catelea enum e declarat
        //si equals si == sunt valabile pt enum
        PuncteCardinale pc = NORD;
        System.out.println(NORD.equals(pc)); //returneaza true

        PuncteCardinale[] values = PuncteCardinale.values();
        for(PuncteCardinale pcard : values) {
            System.out.println(pcard);
        }

        PuncteCardinale nord = PuncteCardinale.valueOf("NORD"); //transforma String in enum
        System.out.println(nord);
        PuncteCardinale.valueOf("ALTCEVA");

    }
}
