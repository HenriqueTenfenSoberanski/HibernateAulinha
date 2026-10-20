/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.atividade.bombeiro;

import ifc.ibirama.atividade.TelefoneContato.TelefoneContato;
import ifc.ibirama.atividade.Usuario.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.HashSet;

/**
 *
 * @author aluno
 */
@Entity
@Table(name="Bombeiro")
public class Bombeiro {
    
    @OneToOne
    @JoinColumn(name = "bom_id", unique = true);
    private Usuario usuario;
    
    public Bombeiro(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="bom_id")
    private Integer id;
    @Column(name="bom_cpf", length=11, unique=true , nullable=false)
    private String cpf;
    @Column(name="bom_Data_nacimento", nullable=false)
    private LocalDate data_Nacimento;
    @Column(name="bom_nome_completo", length=45,nullable=false)
    private String Nome;
    @Column(name="bom_nome_guerra", length=45, unique=true , nullable=false)
    private String Nome_Guerra;
    /*
    private Usuario usuario;
    @OneToMany(mappedBy = "Bombeiro")
    private set<TelefoneContato> telefone = new HashSet<TelefoneContato>();
    @ManyToMany
    @JoinTable(name="Bombeiro_has_patente", @joinColumns = "bom_id", inverseJoinColumn = @JoinColumn("pat_id"));
    private Set<Patente> patente = new HashSet<Patente>();
    */
    
    public Bombeiro() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_Nacimento() {
        return data_Nacimento;
    }

    public void setData_Nacimento(LocalDate data_Nacimento) {
        this.data_Nacimento = data_Nacimento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome_Guerra() {
        return Nome_Guerra;
    }

    public void setNome_Guerra(String Nome_Guerra) {
        this.Nome_Guerra = Nome_Guerra;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    /*
    public <any> getTelefone() {
        return telefone;
    }

    public void setTelefone(<any> telefone) {
        this.telefone = telefone;
    }
    
    public <any> getPatente() {
        return patente;
    }

    public void setPatente(<any> patente) {
        this.patente = patente;
    */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;
            if ((aux.getId().equals(this.id)) && (aux.getCpf().equals(this.cpf))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        
    }
    @Override
            
    public int hashCode(){
        return getClass().hashCode();
    }
    
}