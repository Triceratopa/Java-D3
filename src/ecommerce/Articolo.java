package ecommerce;

public class Articolo {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int nPezzi;

    public Articolo(int codiceArticolo, String descrizioneArticolo, double prezzo) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.nPezzi = 0;
    }
    public int getCodiceArticolo() {
        return codiceArticolo;
    }
    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }
    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public int getNPezzi() {
        return nPezzi;
    }
    public void setNPezzi(int nPezzi) {
        this.nPezzi = nPezzi;
    }
    public void aggiungiPezzi(int nPezzi) {
        this.nPezzi += nPezzi;
    }


}

