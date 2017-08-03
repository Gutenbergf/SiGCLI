/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gutenberg
 */
public class Contrato {

    private Endereco endereco;
    //private int qtdMeses;
    private String dtInicio;
    private String dtTermino;
    //private int prazoPag; //Dia do mes
    //private int prazoPagExtenso; //Dia do mes
    private double valorAluguel;
    private double valorAluguelExtenso;
    
    public Contrato(Endereco endereco, String dtInicio, String dtTermino, double valorAluguel) {
        this.endereco = endereco;
        this.dtInicio = dtInicio;
        this.dtTermino = dtTermino;
        this.valorAluguel = valorAluguel;
        //this.valorAluguelExtenso = valorAluguelExtenso;
    }
    
    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dtInicio
     */
    public String getDtInicio() {
        return dtInicio;
    }

    /**
     * @param dtInicio the dtInicio to set
     */
    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    /**
     * @return the dtTermino
     */
    public String getDtTermino() {
        return dtTermino;
    }

    /**
     * @param dtTermino the dtTermino to set
     */
    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    /**
     * @return the valorAluguel
     */
    public double getValorAluguel() {
        return valorAluguel;
    }

    /**
     * @param valorAluguel the valorAluguel to set
     */
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    /**
     * @return the valorAluguelExtenso
     */
    public double getValorAluguelExtenso() {
        return valorAluguelExtenso;
    }

    /**
     * @param valorAluguelExtenso the valorAluguelExtenso to set
     */
    public void setValorAluguelExtenso(double valorAluguelExtenso) {
        this.valorAluguelExtenso = valorAluguelExtenso;
    }
    

      
    
    
}
