/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.atividade.viatura;

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
@Table(name = "Viatura")
public class Viatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "via_id")
    private Integer Id;

    @Column(name = "via_placa", length = 7, unique = true, nullable = false)
    private String Placa;
    
    @Column(name = "via_combustivel", length = 45, nullable = false)
    private String Combustivel;

    @Column(name = "via_modelo", length = 45, nullable = false)
    private LocalDate UltimaRevisao;

    @Column(name = "via_ano", nullable = false)
    private Integer Km;

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
     * @return the placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.Placa = placa;
    }
    
    public LocalDate getUltimaRevisao() {
        return UltimaRevisao;
    }

    /**
     * @param ultimaRevisao the ultimaRevisao to set
     */
    public void setUltimaRevisao(LocalDate ultimaRevisao) {
        this.UltimaRevisao = ultimaRevisao;
    }

    
    /**
     * @return the marca
     */
    public String getCombustivel() {
        return Combustivel;
    }

    /**
     * @param combustivel the marca to set
     */
    public void setCombustivel(String combustivel) {
        this.Combustivel = combustivel;
    }
    
    /**
     * @return the km
     */
    public Integer getKm() {
        return Km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(Integer km) {
        this.Km = km;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Viatura) {
            Viatura aux = (Viatura) obj;

            if ((aux.getId().equals(this.Id))
                    && (aux.getPlaca().equals(this.Placa))) {
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