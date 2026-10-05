

package ifc.ibirama.atividade.AutoTanque;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AutoTanque")
public class AutoTanque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autt_id")
    private Integer Id;

    @Column(name = "autt_Altura_Max", length = 45, unique = true, nullable = false)
    private Integer Aut_Litragem;

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
     * @return the Altura_Max
     */
    public Integer getAut_Litragem() {
        return Aut_Litragem;
    }

    /**
     * @param Aut_Litragem the Altura_Max to set
     */
    public void setAltura_Max(Integer Aut_Litragem) {
        this.Aut_Litragem = Aut_Litragem;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AutoTanque) {
            AutoTanque aux = (AutoTanque) obj;

            if ((aux.getId().equals(this.getId()))
                    && (aux.getAut_Litragem().equals(this.Aut_Litragem))) {
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

