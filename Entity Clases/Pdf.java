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
@Table(name = "Pdf")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pdf.findAll", query = "SELECT p FROM Pdf p"),
    @NamedQuery(name = "Pdf.findByIdPdf", query = "SELECT p FROM Pdf p WHERE p.idPdf = :idPdf"),
    @NamedQuery(name = "Pdf.findByUrl", query = "SELECT p FROM Pdf p WHERE p.url = :url"),
    @NamedQuery(name = "Pdf.findByNombrePdf", query = "SELECT p FROM Pdf p WHERE p.nombrePdf = :nombrePdf")})
public class Pdf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pdf")
    private Integer idPdf;
    @Basic(optional = false)
    @Column(name = "URL")
    private String url;
    @Basic(optional = false)
    @Column(name = "nombre_pdf")
    private String nombrePdf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pdfidpdf")
    private Collection<Ruta> rutaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pdfidpdf")
    private Collection<Tarifario> tarifarioCollection;

    public Pdf() {
    }

    public Pdf(Integer idPdf) {
        this.idPdf = idPdf;
    }

    public Pdf(Integer idPdf, String url, String nombrePdf) {
        this.idPdf = idPdf;
        this.url = url;
        this.nombrePdf = nombrePdf;
    }

    public Integer getIdPdf() {
        return idPdf;
    }

    public void setIdPdf(Integer idPdf) {
        this.idPdf = idPdf;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombrePdf() {
        return nombrePdf;
    }

    public void setNombrePdf(String nombrePdf) {
        this.nombrePdf = nombrePdf;
    }

    @XmlTransient
    public Collection<Ruta> getRutaCollection() {
        return rutaCollection;
    }

    public void setRutaCollection(Collection<Ruta> rutaCollection) {
        this.rutaCollection = rutaCollection;
    }

    @XmlTransient
    public Collection<Tarifario> getTarifarioCollection() {
        return tarifarioCollection;
    }

    public void setTarifarioCollection(Collection<Tarifario> tarifarioCollection) {
        this.tarifarioCollection = tarifarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPdf != null ? idPdf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pdf)) {
            return false;
        }
        Pdf other = (Pdf) object;
        if ((this.idPdf == null && other.idPdf != null) || (this.idPdf != null && !this.idPdf.equals(other.idPdf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Pdf[ idPdf=" + idPdf + " ]";
    }
    
}
