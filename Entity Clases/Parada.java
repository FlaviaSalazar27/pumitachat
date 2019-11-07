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
@Table(name = "Parada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parada.findAll", query = "SELECT p FROM Parada p"),
    @NamedQuery(name = "Parada.findByIdParada", query = "SELECT p FROM Parada p WHERE p.idParada = :idParada"),
    @NamedQuery(name = "Parada.findByNombreParada", query = "SELECT p FROM Parada p WHERE p.nombreParada = :nombreParada"),
    @NamedQuery(name = "Parada.findByLatitud", query = "SELECT p FROM Parada p WHERE p.latitud = :latitud"),
    @NamedQuery(name = "Parada.findByLongitud", query = "SELECT p FROM Parada p WHERE p.longitud = :longitud")})
public class Parada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_parada")
    private Integer idParada;
    @Basic(optional = false)
    @Column(name = "nombre_parada")
    private String nombreParada;
    @Basic(optional = false)
    @Column(name = "latitud")
    private String latitud;
    @Basic(optional = false)
    @Column(name = "longitud")
    private String longitud;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paradaidparada")
    private Collection<RutaParada> rutaParadaCollection;

    public Parada() {
    }

    public Parada(Integer idParada) {
        this.idParada = idParada;
    }

    public Parada(Integer idParada, String nombreParada, String latitud, String longitud) {
        this.idParada = idParada;
        this.nombreParada = nombreParada;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Integer getIdParada() {
        return idParada;
    }

    public void setIdParada(Integer idParada) {
        this.idParada = idParada;
    }

    public String getNombreParada() {
        return nombreParada;
    }

    public void setNombreParada(String nombreParada) {
        this.nombreParada = nombreParada;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @XmlTransient
    public Collection<RutaParada> getRutaParadaCollection() {
        return rutaParadaCollection;
    }

    public void setRutaParadaCollection(Collection<RutaParada> rutaParadaCollection) {
        this.rutaParadaCollection = rutaParadaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParada != null ? idParada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parada)) {
            return false;
        }
        Parada other = (Parada) object;
        if ((this.idParada == null && other.idParada != null) || (this.idParada != null && !this.idParada.equals(other.idParada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Parada[ idParada=" + idParada + " ]";
    }
    
}
