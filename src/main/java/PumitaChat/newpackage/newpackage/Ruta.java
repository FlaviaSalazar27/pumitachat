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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Ruta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ruta.findAll", query = "SELECT r FROM Ruta r"),
    @NamedQuery(name = "Ruta.findByIdRuta", query = "SELECT r FROM Ruta r WHERE r.idRuta = :idRuta"),
    @NamedQuery(name = "Ruta.findByNombreRuta", query = "SELECT r FROM Ruta r WHERE r.nombreRuta = :nombreRuta")})
public class Ruta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ruta")
    private Integer idRuta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "nombre_ruta")
    private String nombreRuta;
    @JoinColumn(name = "Pdf_id_pdf", referencedColumnName = "id_pdf")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pdf pdfidpdf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rutaidruta", fetch = FetchType.LAZY)
    private List<RutaParada> rutaParadaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rutaidruta", fetch = FetchType.LAZY)
    private List<Horario> horarioList;

    public Ruta() {
    }

    public Ruta(Integer idRuta) {
        this.idRuta = idRuta;
    }

    public Ruta(Integer idRuta, String nombreRuta) {
        this.idRuta = idRuta;
        this.nombreRuta = nombreRuta;
    }

    public Integer getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Integer idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public Pdf getPdfidpdf() {
        return pdfidpdf;
    }

    public void setPdfidpdf(Pdf pdfidpdf) {
        this.pdfidpdf = pdfidpdf;
    }

    @XmlTransient
    public List<RutaParada> getRutaParadaList() {
        return rutaParadaList;
    }

    public void setRutaParadaList(List<RutaParada> rutaParadaList) {
        this.rutaParadaList = rutaParadaList;
    }

    @XmlTransient
    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRuta != null ? idRuta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ruta)) {
            return false;
        }
        Ruta other = (Ruta) object;
        if ((this.idRuta == null && other.idRuta != null) || (this.idRuta != null && !this.idRuta.equals(other.idRuta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PumitaChat.newpackage.newpackage.Ruta[ idRuta=" + idRuta + " ]";
    }
    
}
