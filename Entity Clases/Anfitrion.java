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
@Table(name = "Anfitrion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anfitrion.findAll", query = "SELECT a FROM Anfitrion a"),
    @NamedQuery(name = "Anfitrion.findByIdAnfitrion", query = "SELECT a FROM Anfitrion a WHERE a.idAnfitrion = :idAnfitrion"),
    @NamedQuery(name = "Anfitrion.findByNombreAnfitrion", query = "SELECT a FROM Anfitrion a WHERE a.nombreAnfitrion = :nombreAnfitrion"),
    @NamedQuery(name = "Anfitrion.findByApellidoAnfitrion", query = "SELECT a FROM Anfitrion a WHERE a.apellidoAnfitrion = :apellidoAnfitrion"),
    @NamedQuery(name = "Anfitrion.findByTelefono", query = "SELECT a FROM Anfitrion a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Anfitrion.findByCorreo", query = "SELECT a FROM Anfitrion a WHERE a.correo = :correo")})
public class Anfitrion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_anfitrion")
    private Integer idAnfitrion;
    @Basic(optional = false)
    @Column(name = "nombre_anfitrion")
    private String nombreAnfitrion;
    @Basic(optional = false)
    @Column(name = "apellido_anfitrion")
    private String apellidoAnfitrion;
    @Basic(optional = false)
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anfitrionidanfitrion")
    private Collection<BusAnfitrion> busAnfitrionCollection;

    public Anfitrion() {
    }

    public Anfitrion(Integer idAnfitrion) {
        this.idAnfitrion = idAnfitrion;
    }

    public Anfitrion(Integer idAnfitrion, String nombreAnfitrion, String apellidoAnfitrion, int telefono, String correo) {
        this.idAnfitrion = idAnfitrion;
        this.nombreAnfitrion = nombreAnfitrion;
        this.apellidoAnfitrion = apellidoAnfitrion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Integer getIdAnfitrion() {
        return idAnfitrion;
    }

    public void setIdAnfitrion(Integer idAnfitrion) {
        this.idAnfitrion = idAnfitrion;
    }

    public String getNombreAnfitrion() {
        return nombreAnfitrion;
    }

    public void setNombreAnfitrion(String nombreAnfitrion) {
        this.nombreAnfitrion = nombreAnfitrion;
    }

    public String getApellidoAnfitrion() {
        return apellidoAnfitrion;
    }

    public void setApellidoAnfitrion(String apellidoAnfitrion) {
        this.apellidoAnfitrion = apellidoAnfitrion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        hash += (idAnfitrion != null ? idAnfitrion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anfitrion)) {
            return false;
        }
        Anfitrion other = (Anfitrion) object;
        if ((this.idAnfitrion == null && other.idAnfitrion != null) || (this.idAnfitrion != null && !this.idAnfitrion.equals(other.idAnfitrion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Anfitrion[ idAnfitrion=" + idAnfitrion + " ]";
    }
    
}
