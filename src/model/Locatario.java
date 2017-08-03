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
public class Locatario {

    /**
     * @return the nomeLocatario
     */
    
    private String nomeLocatario;
    private String nacionalidadeLocatario;
    private String stCivilLocatario;
    private String profLocatario;
    private String rgLocatario;
    private String cpfLocatario;

    public Locatario(String nomeLocatario, String nacionalidadeLocatario, String stCivilLocatario, String profLocatario, String rgLocatario, String cpfLocatario) {
        this.nomeLocatario = nomeLocatario;
        this.nacionalidadeLocatario = nacionalidadeLocatario;
        this.stCivilLocatario = stCivilLocatario;
        this.profLocatario = profLocatario;
        this.rgLocatario = rgLocatario;
        this.cpfLocatario = cpfLocatario;
    }
    
    
    
    
    public String getNomeLocatario() {
        return nomeLocatario;
    }

    /**
     * @param nomeLocatario the nomeLocatario to set
     */
    public void setNomeLocatario(String nomeLocatario) {
        this.nomeLocatario = nomeLocatario;
    }

    /**
     * @return the nacionalidadeLocatario
     */
    public String getNacionalidadeLocatario() {
        return nacionalidadeLocatario;
    }

    /**
     * @param nacionalidadeLocatario the nacionalidadeLocatario to set
     */
    public void setNacionalidadeLocatario(String nacionalidadeLocatario) {
        this.nacionalidadeLocatario = nacionalidadeLocatario;
    }

    /**
     * @return the stCivilLocatario
     */
    public String getStCivilLocatario() {
        return stCivilLocatario;
    }

    /**
     * @param stCivilLocatario the stCivilLocatario to set
     */
    public void setStCivilLocatario(String stCivilLocatario) {
        this.stCivilLocatario = stCivilLocatario;
    }

    /**
     * @return the profLocatario
     */
    public String getProfLocatario() {
        return profLocatario;
    }

    /**
     * @param profLocatario the profLocatario to set
     */
    public void setProfLocatario(String profLocatario) {
        this.profLocatario = profLocatario;
    }

    /**
     * @return the rgLocatario
     */
    public String getRgLocatario() {
        return rgLocatario;
    }

    /**
     * @param rgLocatario the rgLocatario to set
     */
    public void setRgLocatario(String rgLocatario) {
        this.rgLocatario = rgLocatario;
    }

    /**
     * @return the cpfLocatario
     */
    public String getCpfLocatario() {
        return cpfLocatario;
    }

    /**
     * @param cpfLocatario the cpfLocatario to set
     */
    public void setCpfLocatario(String cpfLocatario) {
        this.cpfLocatario = cpfLocatario;
    }

    /**
     * @return the nomeLocador
     */
    
   
   
    
    
    
   
    
}
