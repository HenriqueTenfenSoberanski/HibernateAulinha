/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ifc.ibirama.atividade.TelefoneContato;

import ifc.ibirama.atividade.bombeiro.Bombeiro;
import ifc.ibirama.atividade.patente.Patente;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class TelefoneContato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tec_id")
    private Integer id;
    @Column(name = "tec_numero", length = 11, nullable = false,unique = true)
    private String numero;
    @Column(name = "tec_tipo", length = 5, nullable = false)
    private String tipo;
    @ManyToOne
    @JoinColumn(name="bom_id", unique=false)
    private Bombeiro bombeiro;
    
    private Set<Patente> patente = new HashSet<;
    
    
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
