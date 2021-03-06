package monopoly;

public abstract class Carreau {

    protected int numero;
    protected String nomCarreau;
    protected Monopoly monopoly;

    public Carreau(int numero, String nomCarreau, Monopoly monopoly) {
        this.numero = numero;
        this.nomCarreau = nomCarreau;
        this.monopoly = monopoly;
    }
    
    public abstract void action(Joueur joueur);

    public int getId() {
        return numero;
    }
    
    public String getNomCarreau() {
        return nomCarreau;
    }
    
    @Override
   public String toString() {
       return "#"+getId()+" - "+getNomCarreau();
   }
}
