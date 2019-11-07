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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "Informaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Informaciones.findAll", query = "SELECT i FROM Informaciones i"),
    @NamedQuery(name = "Informaciones.findByIdInformaciones", query = "SELECT i FROM Informaciones i WHERE i.idInformaciones = :idInformaciones"),
    @NamedQuery(name = "Informaciones.findByInformacion", query = "SELECT i FROM Informaciones i WHERE i.informacion = :informacion")})
public class Informaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_informaciones")
    private Integer idInformaciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "informacion")
    private String informacion;

    public Informaciones() {
    }

    public Informaciones(Integer idInformaciones) {
        this.idInformaciones = idInformaciones;
    }

    public Informaciones(Integer idInformaciones, String informacion) {
        this.idInformaciones = idInformaciones;
        this.informacion = informacion;
    }

    public Integer getIdInformaciones() {
        return idInformaciones;
    }

    public void setIdInformaciones(Integer idInformaciones) {
        this.idInformaciones = idInformaciones;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformaciones != null ? idInformaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informaciones)) {
            return false;
        }
        Informaciones other = (Informaciones) object;
        if ((this.idInformaciones == null && other.idInformaciones != null) || (this.idInformaciones != null && !this.idInformaciones.equals(other.idInformaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PumitaChat.newpackage.newpackage.Informaciones[ idInformaciones=" + idInformaciones + " ]";
    }
    
}
