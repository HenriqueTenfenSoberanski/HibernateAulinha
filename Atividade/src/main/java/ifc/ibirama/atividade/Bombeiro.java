/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.atividade;

import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public class Bombeiro {
    
    private Integer Id;
    private String Cpf;
    private LocalDate DataNascimento;
    private String NomeCompleto;
    private String Guerra;

    /**
     * @return the id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.Id = id;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return Cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.Cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.DataNascimento = dataNascimento;
    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return NomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.NomeCompleto = nomeCompleto;
    }

    /**
     * @return the guerra
     */
    public String getGuerra() {
        return Guerra;
    }

    /**
     * @param guerra the guerra to set
     */
    public void setGuerra(String guerra) {
        this.Guerra = guerra;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) { 
           Bombeiro aux = (Bombeiro)obj;
        }
            if ((aux.getId().equals(this.Id)) && (aux.getCpf().equals(this.Cpf))){
                
            
        }else {
            return false;
        }
    }
    
}
