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
@Table(name = "Ruta_Parada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RutaParada.findAll", query = "SELECT r FROM RutaParada r"),
    @NamedQuery(name = "RutaParada.findByIdRutaParada", query = "SELECT r FROM RutaParada r WHERE r.idRutaParada = :idRutaParada")})
public class RutaParada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_ruta_parada")
    private Integer idRutaParada;
    @JoinColumn(name = "Parada_id_parada", referencedColumnName = "id_parada")
    @ManyToOne(optional = false)
    private Parada paradaidparada;
    @JoinColumn(name = "Ruta_id_ruta", referencedColumnName = "id_ruta")
    @ManyToOne(optional = false)
    private Ruta rutaidruta;

    public RutaParada() {
    }

    public RutaParada(Integer idRutaParada) {
        this.idRutaParada = idRutaParada;
    }

    public Integer getIdRutaParada() {
        return idRutaParada;
    }

    public void setIdRutaParada(Integer idRutaParada) {
        this.idRutaParada = idRutaParada;
    }

    public Parada getParadaidparada() {
        return paradaidparada;
    }

    public void setParadaidparada(Parada paradaidparada) {
        this.paradaidparada = paradaidparada;
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
        hash += (idRutaParada != null ? idRutaParada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RutaParada)) {
            return false;
        }
        RutaParada other = (RutaParada) object;
        if ((this.idRutaParada == null && other.idRutaParada != null) || (this.idRutaParada != null && !this.idRutaParada.equals(other.idRutaParada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.RutaParada[ idRutaParada=" + idRutaParada + " ]";
    }
    
}
