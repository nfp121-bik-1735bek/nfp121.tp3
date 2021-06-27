package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * D�crivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;

    public Pile3() {
        this(0);
    }

    public Pile3(int taille) {
        // traiter le cas <=0
        // � compl�ter
        if(taille <= 0)
            taille = CAPACITE_PAR_DEFAUT;
        
        v = new Vector<Object>(taille);
    }

    public void empiler(Object o) throws PilePleineException {
        // � compl�ter
        if(estPleine())
            throw new PilePleineException();
        
        this.v.addElement(o);
        
    }

    public Object depiler() throws PileVideException {
        // � compl�ter
        if(estVide())
            throw new PileVideException();
        
        return this.v.remove(this.taille() - 1);
    }

    public Object sommet() throws PileVideException {
        // � compl�ter
        return this.v.lastElement();
    }

    public int taille() {
        // � compl�ter
        return this.v.size();
    }

    public int capacite() {
        // � compl�ter
        return this.v.capacity();
    }

    public boolean estVide() {
        // � compl�ter
        return this.taille() == 0;
    }

    public boolean estPleine() {
        // � compl�ter
        return this.taille() == this.capacite();
    }

    public String toString() {
        // � compl�ter
         String s = "[";
        // a completer
        for (int i = this.taille() - 1; i >= 0; i--) {
            s += this.v.elementAt(i).toString();
            if (i > 0)
                s += ", ";
        }
        return s + "]";
    }

    public boolean equals(Object o) {
        // � compl�ter
        if(o instanceof Pile3){
            Pile3 temp;
            temp = (Pile3)o;
                
            if (this.capacite() != temp.capacite() || this.taille() != temp.taille())
                return false;
            
            for(int i =0;i < this.taille();i++){
                if(!this.v.elementAt(i).equals(temp.v.elementAt(i)))
                    return false;
            }
            return true;
        }
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
