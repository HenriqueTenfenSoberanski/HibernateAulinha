/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.atividade.patente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Patente")
public class Patente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pat_id")
    private Integer Id;

    @Column(name = "pat_sigla", length = 10, unique = true, nullable = false)
    private String Sigla;
    
    @Column(name = "pat_descricao", length = 45, nullable = false)
    private String Descricao;

    /**
     * @return the Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * @return the Sigla
     */
    public String getSigla() {
        return Sigla;
    }

    /**
     * @param Sigla the Sigla to set
     */
    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Patente) {
            Patente aux = (Patente) obj;

            if ((aux.getId().equals(this.getId())) && (aux.getSigla().equals(this.Sigla))) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return getClass().hashCode();

    }

    
}