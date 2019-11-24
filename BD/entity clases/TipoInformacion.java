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
@Table(name = "tipo_informacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoInformacion.findAll", query = "SELECT t FROM TipoInformacion t"),
    @NamedQuery(name = "TipoInformacion.findByIdTipoi", query = "SELECT t FROM TipoInformacion t WHERE t.idTipoi = :idTipoi"),
    @NamedQuery(name = "TipoInformacion.findByInformacion", query = "SELECT t FROM TipoInformacion t WHERE t.informacion = :informacion")})
public class TipoInformacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipoi")
    private Integer idTipoi;
    @Column(name = "informacion")
    private String informacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoInformacion")
    private Collection<Informacion> informacionCollection;

    public TipoInformacion() {
    }

    public TipoInformacion(Integer idTipoi) {
        this.idTipoi = idTipoi;
    }

    public Integer getIdTipoi() {
        return idTipoi;
    }

    public void setIdTipoi(Integer idTipoi) {
        this.idTipoi = idTipoi;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    @XmlTransient
    public Collection<Informacion> getInformacionCollection() {
        return informacionCollection;
    }

    public void setInformacionCollection(Collection<Informacion> informacionCollection) {
        this.informacionCollection = informacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoi != null ? idTipoi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoInformacion)) {
            return false;
        }
        TipoInformacion other = (TipoInformacion) object;
        if ((this.idTipoi == null && other.idTipoi != null) || (this.idTipoi != null && !this.idTipoi.equals(other.idTipoi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TipoInformacion[ idTipoi=" + idTipoi + " ]";
    }
    
}
