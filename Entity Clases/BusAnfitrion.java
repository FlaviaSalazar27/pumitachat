/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ele
 */
@Entity
@Table(name = "bus_anfitrion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BusAnfitrion.findAll", query = "SELECT b FROM BusAnfitrion b"),
    @NamedQuery(name = "BusAnfitrion.findByIdBusAnfitrion", query = "SELECT b FROM BusAnfitrion b WHERE b.idBusAnfitrion = :idBusAnfitrion")})
public class BusAnfitrion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_bus_anfitrion")
    private Integer idBusAnfitrion;
    @JoinColumn(name = "Anfitrion_id_anfitrion", referencedColumnName = "id_anfitrion")
    @ManyToOne(optional = false)
    private Anfitrion anfitrionidanfitrion;
    @JoinColumn(name = "Bus_id_bus", referencedColumnName = "id_bus")
    @ManyToOne(optional = false)
    private Bus busidbus;

    public BusAnfitrion() {
    }

    public BusAnfitrion(Integer idBusAnfitrion) {
        this.idBusAnfitrion = idBusAnfitrion;
    }

    public Integer getIdBusAnfitrion() {
        return idBusAnfitrion;
    }

    public void setIdBusAnfitrion(Integer idBusAnfitrion) {
        this.idBusAnfitrion = idBusAnfitrion;
    }

    public Anfitrion getAnfitrionidanfitrion() {
        return anfitrionidanfitrion;
    }

    public void setAnfitrionidanfitrion(Anfitrion anfitrionidanfitrion) {
        this.anfitrionidanfitrion = anfitrionidanfitrion;
    }

    public Bus getBusidbus() {
        return busidbus;
    }

    public void setBusidbus(Bus busidbus) {
        this.busidbus = busidbus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBusAnfitrion != null ? idBusAnfitrion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusAnfitrion)) {
            return false;
        }
        BusAnfitrion other = (BusAnfitrion) object;
        if ((this.idBusAnfitrion == null && other.idBusAnfitrion != null) || (this.idBusAnfitrion != null && !this.idBusAnfitrion.equals(other.idBusAnfitrion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.BusAnfitrion[ idBusAnfitrion=" + idBusAnfitrion + " ]";
    }
    
}
