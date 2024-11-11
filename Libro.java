public class Libro{
    //Definizione attributi
    private String titolo;
    private String autore;
    private float prezzo;
    private int npag;
    private String editore;

    //Definizione costruttore
    public Libro(String titolo, String autore, float prezzo, int npag, String editore){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.npag = npag;
        this.editore = editore;
    }
    
    //Definizione metodi 
    //Definire metodo toString()
    public String toString(){
        return("titolo"+ titolo +"autore"+ autore +"prezzo"+ prezzo +"npag"+ npag +"editore"+ editore);
        
    }
}