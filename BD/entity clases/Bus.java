/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "bus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bus.findAll", query = "SELECT b FROM Bus b"),
    @NamedQuery(name = "Bus.findByIdBus", query = "SELECT b FROM Bus b WHERE b.idBus = :idBus"),
    @NamedQuery(name = "Bus.findByPlaca", query = "SELECT b FROM Bus b WHERE b.placa = :placa"),
    @NamedQuery(name = "Bus.findByConductor", query = "SELECT b FROM Bus b WHERE b.conductor = :conductor"),
    @NamedQuery(name = "Bus.findByAnfitrion", query = "SELECT b FROM Bus b WHERE b.anfitrion = :anfitrion")})
public class Bus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_bus")
    private Integer idBus;
    @Column(name = "placa")
    private String placa;
    @Column(name = "conductor")
    private String conductor;
    @Column(name = "anfitrion")
    private String anfitrion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bus")
    private Collection<BusParada> busParadaCollection;

    public Bus() {
    }

    public Bus(Integer idBus) {
        this.idBus = idBus;
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

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }

    @XmlTransient
    public Collection<BusParada> getBusParadaCollection() {
        return busParadaCollection;
    }

    public void setBusParadaCollection(Collection<BusParada> busParadaCollection) {
        this.busParadaCollection = busParadaCollection;
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
        return "entity.Bus[ idBus=" + idBus + " ]";
    }
    
}
