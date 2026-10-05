/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ifc.ibirama.atividade.TelefoneContato;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author aluno
 */
public class TelefoneContato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "autt_id")
    private Integer Id;
    private String Numero;
    private String Tipo;

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
     * @return the numero
     */
    public String getNumero() {
        return Numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.Numero = numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TelefoneContato) {
            TelefoneContato aux = (TelefoneContato) obj;

            if ((aux.getId().equals(this.Id))
                    && (aux.getTipo().equals(this.Tipo))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
