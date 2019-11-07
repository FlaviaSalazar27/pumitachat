/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ele
 */
@Entity
@Table(name = "Bus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bus.findAll", query = "SELECT b FROM Bus b"),
    @NamedQuery(name = "Bus.findByIdBus", query = "SELECT b FROM Bus b WHERE b.idBus = :idBus"),
    @NamedQuery(name = "Bus.findByPlaca", query = "SELECT b FROM Bus b WHERE b.placa = :placa"),
    @NamedQuery(name = "Bus.findByNombreConductor", query = "SELECT b FROM Bus b WHERE b.nombreConductor = :nombreConductor")})
public class Bus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_bus")
    private Integer idBus;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @Column(name = "nombre_conductor")
    private String nombreConductor;
    @JoinColumn(name = "Horario_id_horario", referencedColumnName = "id_horario")
    @ManyToOne(optional = false)
    private Horario horarioidhorario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "busidbus")
    private Collection<BusAnfitrion> busAnfitrionCollection;

    public Bus() {
    }

    public Bus(Integer idBus) {
        this.idBus = idBus;
    }

    public Bus(Integer idBus, String placa, String nombreConductor) {
        this.idBus = idBus;
        this.placa = placa;
        this.nombreConductor = nombreConductor;
    }

    public Integer getIdBus() {
        return idBus;
    }

    public void setIdBus(Integer idBus) {
        this.idBus = idBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public Horario getHorarioidhorario() {
        return horarioidhorario;
    }

    public void setHorarioidhorario(Horario horarioidhorario) {
        this.horarioidhorario = horarioidhorario;
    }

    @XmlTransient
    public Collection<BusAnfitrion> getBusAnfitrionCollection() {
        return busAnfitrionCollection;
    }

    public void setBusAnfitrionCollection(Collection<BusAnfitrion> busAnfitrionCollection) {
        this.busAnfitrionCollection = busAnfitrionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBus != null ? idBus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bus)) {
            return false;
        }
        Bus other = (Bus) object;
        if ((this.idBus == null && other.idBus != null) || (this.idBus != null && !this.idBus.equals(other.idBus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Bus[ idBus=" + idBus + " ]";
    }
    
}
