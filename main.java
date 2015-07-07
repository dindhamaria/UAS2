package com.company;

/**
 * Created by dindha on 6/30/2015.
 */
public class main {

    public static void main(String[] args) {

        Liga indonesia = new Liga("Indonesia");

        Divisi serieA = new Divisi("Serie A",indonesia);
        Divisi serieB = new Divisi("Serie B",indonesia);

        Klub arema = new Klub("Arema",serieA,indonesia);
        Klub persema = new Klub("Persema",serieB,indonesia);

        indonesia.setDaftarDivisi(serieA);
        indonesia.setDaftarDivisi(serieB);

        serieA.setDaftarKlub(arema);
        serieB.setDaftarKlub(persema);


        //1. Get daftar divisi by nama liga

        System.out.println("1. Get daftar divisi by nama liga :");
        System.out.println("Divisi Liga Indonesia : ");
        indonesia.getDaftarDivisi("Indonesia");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("2. Get Daftar Klub by nama liga :");
        System.out.println("Klub Liga Indonesia : ");
        serieA.getDaftarKlubLiga("Indonesia");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("3. Get Daftar Klub by nama Divisi :");
        System.out.println("Serie A : ");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Serie B : ");
        serieB.getDaftarKlubDivisi("Serie B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("4. Get Klub ini berada di divisi mana by nama Klub :");
        arema.getDivisi("Serie A");
        persema.getDivisi("Arema");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("5. Get Klub ini berada di liga apa by nama Klub :");
        arema.getLiga("Arema");
    }
}


