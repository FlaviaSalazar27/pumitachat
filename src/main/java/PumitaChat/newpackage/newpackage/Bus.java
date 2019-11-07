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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macbookpro
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
    @NotNull
    @Column(name = "id_bus")
    private Integer idBus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre_conductor")
    private String nombreConductor;
    @JoinColumn(name = "Horario_id_horario", referencedColumnName = "id_horario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Horario horarioidhorario;

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
        return "PumitaChat.newpackage.newpackage.Bus[ idBus=" + idBus + " ]";
    }
    
}
