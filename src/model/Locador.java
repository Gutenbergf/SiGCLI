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
public class Locador {

    /**
     * @return the nomeLocador
     */
    
    private String nomeLocador;
    private String nacionalidadeLocador;
    private String stCivilLocado;
    private String profLocador;
    private String rgLocador;
    private String cpfLocador;
    

    public Locador(String nomeLocador, String nacionalidadeLocador, String stCivilLocado, String profLocador, String rgLocador, String cpfLocador) {
        this.nomeLocador = nomeLocador;
        this.nacionalidadeLocador = nacionalidadeLocador;
        this.stCivilLocado = stCivilLocado;
        this.profLocador = profLocador;
        this.rgLocador = rgLocador;
        this.cpfLocador = cpfLocador;
        
    }
    
    
    
    public String getNomeLocador() {
        return nomeLocador;
    }

    /**
     * @param nomeLocador the nomeLocador to set
     */
    public void setNomeLocador(String nomeLocador) {
        this.nomeLocador = nomeLocador;
    }

    /**
     * @return the nacionalidadeLocador
     */
    public String getNacionalidadeLocador() {
        return nacionalidadeLocador;
    }

    /**
     * @param nacionalidadeLocador the nacionalidadeLocador to set
     */
    public void setNacionalidadeLocador(String nacionalidadeLocador) {
        this.nacionalidadeLocador = nacionalidadeLocador;
    }

    /**
     * @return the stCivilLocado
     */
    public String getStCivilLocado() {
        return stCivilLocado;
    }

    /**
     * @param stCivilLocado the stCivilLocado to set
     */
    public void setStCivilLocado(String stCivilLocado) {
        this.stCivilLocado = stCivilLocado;
    }

    /**
     * @return the profLocador
     */
    public String getProfLocador() {
        return profLocador;
    }

    /**
     * @param profLocador the profLocador to set
     */
    public void setProfLocador(String profLocador) {
        this.profLocador = profLocador;
    }

    /**
     * @return the rgLocador
     */
    public String getRgLocador() {
        return rgLocador;
    }

    /**
     * @param rgLocador the rgLocador to set
     */
    public void setRgLocador(String rgLocador) {
        this.rgLocador = rgLocador;
    }

    /**
     * @return the cpfLocador
     */
    public String getCpfLocador() {
        return cpfLocador;
    }

    /**
     * @param cpfLocador the cpfLocador to set
     */
    public void setCpfLocador(String cpfLocador) {
        this.cpfLocador = cpfLocador;
    }

   
    
}
