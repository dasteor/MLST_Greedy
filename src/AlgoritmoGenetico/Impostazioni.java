/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoGenetico;



/**
 *
 * @author Daniel
 */
public class Impostazioni {
    String nomeGrafo;
    int maxValutazioni;
    int sizePopolazione;
    int sizeCromosoma;
    double crossoverRate;
    double mutationRate;
    double strongMutationRate;
    
    public Impostazioni () {
        this.nomeGrafo = "50_200_50_13_2.mlst";
        this.maxValutazioni = 500;
        this.sizePopolazione = 10;
        this.sizeCromosoma = 50;
        this.crossoverRate = 0.8;
        this.mutationRate = 0.2;
        this.strongMutationRate = 0.7;
    }
}