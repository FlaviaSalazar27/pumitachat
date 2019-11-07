/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PumitaChat.newpackage.newpackage;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "Horario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h"),
    @NamedQuery(name = "Horario.findByIdHorario", query = "SELECT h FROM Horario h WHERE h.idHorario = :idHorario"),
    @NamedQuery(name = "Horario.findBySalida", query = "SELECT h FROM Horario h WHERE h.salida = :salida"),
    @NamedQuery(name = "Horario.findByLlegada", query = "SELECT h FROM Horario h WHERE h.llegada = :llegada")})
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_horario")
    private Integer idHorario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salida")
    @Temporal(TemporalType.TIME)
    private Date salida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "llegada")
    @Temporal(TemporalType.TIME)
    private Date llegada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "horarioidhorario", fetch = FetchType.LAZY)
    private List<Bus> busList;
    @JoinColumn(name = "Ruta_id_ruta", referencedColumnName = "id_ruta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ruta rutaidruta;

    public Horario() {
    }

    public Horario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Horario(Integer idHorario, Date salida, Date llegada) {
        this.idHorario = idHorario;
        this.salida = salida;
        this.llegada = llegada;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public Date getLlegada() {
        return llegada;
    }

    public void setLlegada(Date llegada) {
        this.llegada = llegada;
    }

    @XmlTransient
    public List<Bus> getBusList() {
        return busList;
    }

    public void setBusList(List<Bus> busList) {
        this.busList = busList;
    }

    public Ruta getRutaidruta() {
        return rutaidruta;
    }

    public void setRutaidruta(Ruta rutaidruta) {
        this.rutaidruta = rutaidruta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorario != null ? idHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.idHorario == null && other.idHorario != null) || (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PumitaChat.newpackage.newpackage.Horario[ idHorario=" + idHorario + " ]";
    }
    
}
