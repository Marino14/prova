class Scaffale{
    private String id;
    private Libro[] libri;
    private int nLibri;
    private final int N = 10;
    
    Scaffale(String id){
        this.id = id;
        libri = new Libro[N];
        nLibri = 0;
    }
    
    public boolean aggiungi(Libro l){
        if (nLibri<N){
            libri[nLibri] = l;
            nLibri++;
            return true;
        }
        return false;
    }
    
    public void elencaLibri(){
        System.out.println("Scaffale: " + id);
        for(Libro l: libri){
            System.out.println(l);
        }
    }
}