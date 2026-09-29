/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.atividade.bombeiro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Bombeiro")
public class Bombeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bom_id")
    private Integer Id;

    @Column(name = "bom_cpf", length = 11, unique = true, nullable = false)
    private String Cpf;

    @Column(name = "bom_data_nascimento", nullable = false)
    private LocalDate DataNascimento;

    @Column(name = "bom_nome_completo", length = 45, nullable = false)
    private String NomeCompleto;

    @Column(name = "bom_nome_guerra", length = 45, unique = true, nullable = false)
    private String Guerra;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        this.Cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.DataNascimento = dataNascimento;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.NomeCompleto = nomeCompleto;
    }

    public String getGuerra() {
        return Guerra;
    }

    public void setGuerra(String guerra) {
        this.Guerra = guerra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;

            if ((aux.getId().equals(this.Id))
                    && (aux.getCpf().equals(this.Cpf))) {
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
