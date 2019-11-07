/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PumitaChat.newpackage.newpackage;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "bus_anfitrion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BusAnfitrion.findAll", query = "SELECT b FROM BusAnfitrion b"),
    @NamedQuery(name = "BusAnfitrion.findByIdBusAnfitrion", query = "SELECT b FROM BusAnfitrion b WHERE b.idBusAnfitrion = :idBusAnfitrion"),
    @NamedQuery(name = "BusAnfitrion.findByBusidbus", query = "SELECT b FROM BusAnfitrion b WHERE b.busidbus = :busidbus"),
    @NamedQuery(name = "BusAnfitrion.findByAnfitrionidanfitrion", query = "SELECT b FROM BusAnfitrion b WHERE b.anfitrionidanfitrion = :anfitrionidanfitrion")})
public class BusAnfitrion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_bus_anfitrion")
    private Integer idBusAnfitrion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bus_id_bus")
    private int busidbus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anfitrion_id_anfitrion")
    private int anfitrionidanfitrion;

    public BusAnfitrion() {
    }

    public BusAnfitrion(Integer idBusAnfitrion) {
        this.idBusAnfitrion = idBusAnfitrion;
    }

    public BusAnfitrion(Integer idBusAnfitrion, int busidbus, int anfitrionidanfitrion) {
        this.idBusAnfitrion = idBusAnfitrion;
        this.busidbus = busidbus;
        this.anfitrionidanfitrion = anfitrionidanfitrion;
    }

    public Integer getIdBusAnfitrion() {
        return idBusAnfitrion;
    }

    public void setIdBusAnfitrion(Integer idBusAnfitrion) {
        this.idBusAnfitrion = idBusAnfitrion;
    }

    public int getBusidbus() {
        return busidbus;
    }

    public void setBusidbus(int busidbus) {
        this.busidbus = busidbus;
    }

    public int getAnfitrionidanfitrion() {
        return anfitrionidanfitrion;
    }

    public void setAnfitrionidanfitrion(int anfitrionidanfitrion) {
        this.anfitrionidanfitrion = anfitrionidanfitrion;
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
        return "PumitaChat.newpackage.newpackage.BusAnfitrion[ idBusAnfitrion=" + idBusAnfitrion + " ]";
    }
    
}
