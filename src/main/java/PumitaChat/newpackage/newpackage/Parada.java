/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PumitaChat.newpackage.newpackage;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macbookpro
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
    @NotNull
    @Column(name = "id_parada")
    private Integer idParada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "nombre_parada")
    private String nombreParada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "latitud")
    private String latitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "longitud")
    private String longitud;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paradaidparada", fetch = FetchType.LAZY)
    private List<RutaParada> rutaParadaList;

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
    public List<RutaParada> getRutaParadaList() {
        return rutaParadaList;
    }

    public void setRutaParadaList(List<RutaParada> rutaParadaList) {
        this.rutaParadaList = rutaParadaList;
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
        return "PumitaChat.newpackage.newpackage.Parada[ idParada=" + idParada + " ]";
    }
    
}
