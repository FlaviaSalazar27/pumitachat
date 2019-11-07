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
    @NotNull
    @Column(name = "id_pdf")
    private Integer idPdf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "URL")
    private String url;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre_pdf")
    private String nombrePdf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pdfidpdf", fetch = FetchType.LAZY)
    private List<Ruta> rutaList;

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
    public List<Ruta> getRutaList() {
        return rutaList;
    }

    public void setRutaList(List<Ruta> rutaList) {
        this.rutaList = rutaList;
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
        return "PumitaChat.newpackage.newpackage.Pdf[ idPdf=" + idPdf + " ]";
    }
    
}
