

package ifc.ibirama.atividade.AutoEsc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AutoEscada")
public class AutoEscada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aut_id")
    private Integer Id;

    @Column(name = "aut_Altura_Max", length = 45, unique = true, nullable = false)
    private Integer Altura_Max;

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
    public Integer getAltura_Max() {
        return Altura_Max;
    }

    /**
     * @param Altura_Max the Altura_Max to set
     */
    public void setAltura_Max(Integer Altura_Max) {
        this.Altura_Max = Altura_Max;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AutoEscada) {
            AutoEscada aux = (AutoEscada) obj;

            if ((aux.getId().equals(this.getId()))
                    && (aux.getAltura_Max().equals(this.Altura_Max))) {
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

