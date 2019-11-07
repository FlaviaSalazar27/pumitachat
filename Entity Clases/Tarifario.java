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
@Table(name = "Tarifario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarifario.findAll", query = "SELECT t FROM Tarifario t"),
    @NamedQuery(name = "Tarifario.findByIdTarifa", query = "SELECT t FROM Tarifario t WHERE t.idTarifa = :idTarifa"),
    @NamedQuery(name = "Tarifario.findByTarifa", query = "SELECT t FROM Tarifario t WHERE t.tarifa = :tarifa")})
public class Tarifario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tarifa")
    private Integer idTarifa;
    @Basic(optional = false)
    @Column(name = "tarifa")
    private String tarifa;
    @JoinColumn(name = "Pdf_id_pdf", referencedColumnName = "id_pdf")
    @ManyToOne(optional = false)
    private Pdf pdfidpdf;

    public Tarifario() {
    }

    public Tarifario(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public Tarifario(Integer idTarifa, String tarifa) {
        this.idTarifa = idTarifa;
        this.tarifa = tarifa;
    }

    public Integer getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public Pdf getPdfidpdf() {
        return pdfidpdf;
    }

    public void setPdfidpdf(Pdf pdfidpdf) {
        this.pdfidpdf = pdfidpdf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarifa != null ? idTarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarifario)) {
            return false;
        }
        Tarifario other = (Tarifario) object;
        if ((this.idTarifa == null && other.idTarifa != null) || (this.idTarifa != null && !this.idTarifa.equals(other.idTarifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Tarifario[ idTarifa=" + idTarifa + " ]";
    }
    
}
