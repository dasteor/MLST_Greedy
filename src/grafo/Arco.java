package grafo;

import java.util.ArrayList;
import java.util.Objects;

public class Arco {

    Nodo da, a;
    ArrayList<Integer> colori;
    int peso;

    public Arco(Nodo da, Nodo a) {
        this.da = da;
        this.a = a;
        this.colori = new ArrayList<>();
    }

    public Arco(Nodo da, Nodo a, ArrayList<Integer> pColori) {
        this.da = da;
        this.a = a;
        this.colori = new ArrayList(pColori);
    }

    public Nodo getDa() {
        return da;
    }

    public void setDa(Nodo da) {
        this.da = da;
    }

    public Nodo getA() {
        return a;
    }

    public void setA(Nodo a) {
        this.a = a;
    }

    public ArrayList<Integer> getColori() {
        return colori;
    }
    
    public void addColore (int colore) {
        this.colori.add(colore);
    }

    public void setColori(ArrayList<Integer> colori) {
        this.colori = new ArrayList<>(colori);
    }

    public void rimuoviColore(int pColore) {
        this.colori.remove(Integer.valueOf(pColore));
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Arco other = (Arco) obj;
        if (!Objects.equals(this.da, other.da)) {
            return false;
        }
        if (!Objects.equals(this.a, other.a)) {
            return false;
        }
       
        return true;
    }
}
