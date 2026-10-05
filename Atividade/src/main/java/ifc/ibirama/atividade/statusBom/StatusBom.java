

package ifc.ibirama.atividade.statusBom;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StatusBombeiro")
public class StatusBom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stb_id")
    private Integer Id;

    @Column(name = "stb_Sgla", length = 45, unique = true, nullable = false)
    private String Sigla;

    @Column(name = "stb_descricao", length = 5, nullable = false)
    private String Descricao;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String sigla) {
        this.Sigla = sigla;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StatusBom) {
            StatusBom aux = (StatusBom) obj;

            if ((aux.getId().equals(this.Id))
                    && (aux.getSigla().equals(this.Sigla))) {
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

