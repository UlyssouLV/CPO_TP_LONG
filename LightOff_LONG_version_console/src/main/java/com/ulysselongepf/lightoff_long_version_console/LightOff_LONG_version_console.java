package com.ulysselongepf.lightoff_long_version_console;


public class LightOff_LONG_version_console {

    public static void main(String[] args) {
        
        CelluleLumineuse Cellule1 = new CelluleLumineuse();
        System.out.println(Cellule1);
        System.out.println(Cellule1.estEteint());

        Cellule1.activerCellule();
        System.out.println(Cellule1);
        System.out.println(Cellule1.estEteint());
        
        Cellule1.eteindreCellule();
        System.out.println(Cellule1);
        System.out.println(Cellule1.estEteint());
        
        System.out.println(Cellule1.getEtat());

    }
}
