

package ifc.ibirama.atividade.status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StatusBombeiro")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sta_id")
    private Integer Id;

    @Column(name = "sta_nome", length = 45, unique = true, nullable = false)
    private String Nome;

    @Column(name = "sta_descricao", length = 100, nullable = false)
    private String Descricao;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status aux = (Status) obj;

            if ((aux.getId().equals(this.Id))
                    && (aux.getNome().equals(this.Nome))) {
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

