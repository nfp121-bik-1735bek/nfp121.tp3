package question3;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2<T> implements PileI<T>{
    /** par d�l�gation : utilisation de la class Stack */
    private Stack<T> stk;
    /** la capacit� de la pile */
    private int capacite;
    /** Cr�ation d'une pile.
     * @param taille la "taille maximale" de la pile, doit �tre > 0
     */
    public Pile2(int taille){
        // � compl�ter
        if(taille <= 0)
            taille = CAPACITE_PAR_DEFAUT;
        this.capacite = taille;
        stk = new Stack<T>();
    }

    public Pile2(){
        // � compl�ter
        this(0);
        
    }

    public void empiler(T o) throws PilePleineException{
        // � compl�ter
        if(estPleine())
            throw new PilePleineException();
        stk.push(o);
        
    }

    public T depiler() throws PileVideException{
        // � compl�ter
        if(estVide())
            throw new PileVideException();
        return stk.pop();
    }

    public T sommet() throws PileVideException{
        // � compl�ter
        return stk.peek();
    }
    public boolean estVide(){
        return this.stk.empty();
        
    }
    public boolean estPleine(){
        return this.taille() == this.capacite();
    }
    
    public int capacite(){
        return this.capacite;
    }
    public int taille(){
        return this.stk.size();    
    }
    
    public String toString(){
        String s = "[";
        // a completer
        for (int i = this.taille() - 1; i >= 0; i--) {
            s += this.stk.elementAt(i).toString();
            if (i > 0)
                s += ", ";
        }
        return s + "]";
    }
    // recopier ici toutes les autres m�thodes
    // qui ne sont pas modifi�es en fonction
    // du type des �l�ments de la pile

} // Pile2