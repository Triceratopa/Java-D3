package cellulare;

import java.util.Arrays;

public class Sim {
    public String number;
    private double credit;
    private Chiamata[] listaChiamate;

    public Sim (String number){
        this.number = number;
        this.credit = 0;
        this.listaChiamate = new Chiamata[5];
    }

    public void aggiungiCredito (double nuovoCredito){
        this.credit += nuovoCredito;
    }
    public void setListaChiamate(Chiamata[] listaChiamate) {
        this.listaChiamate = listaChiamate;
    }
    public void stampaDati(){
        System.out.println("Sim: " + this.number);
        System.out.println("Credito: " + this.credit);
        if(listaChiamate[0] != null){
            System.out.println("Chiamata: " + listaChiamate[0].getNumeroChiamato() + "Durata: " + listaChiamate[0].getDurata());

        }
        if(listaChiamate[1] != null){
            System.out.println("Chiamata: " + listaChiamate[1].getNumeroChiamato()  + "Durata: " + listaChiamate[1].getDurata());

        }
        if(listaChiamate[2] != null){
            System.out.println("Chiamata: " + listaChiamate[2].getNumeroChiamato()  + "Durata: " + listaChiamate[2].getDurata());
        }
        if(listaChiamate[3] != null){
            System.out.println("Chiamata: " + listaChiamate[3].getNumeroChiamato()  + "Durata: " + listaChiamate[3].getDurata());

        }
        if(listaChiamate[4] != null){
            System.out.println("Chiamata: " + listaChiamate[4].getNumeroChiamato()  + "Durata: " + listaChiamate[4].getDurata());
        }

    }



}
