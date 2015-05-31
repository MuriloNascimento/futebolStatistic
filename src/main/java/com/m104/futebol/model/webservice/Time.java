
package com.m104.futebol.model.webservice;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.mnstech.futebolStatistic.entidades.Grafico;


/**
 * <p>Java class for time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="escudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time", propOrder = {
    "escudo",
    "estadio",
    "id",
    "nome",
    "tecnico",
    "titulos",
    "grafico",
    "jogadores"
})
@Entity
@XmlRootElement
public class Time {

    protected String escudo;
    protected String estadio;
    @Id
    protected long id;
    protected String nome;
    protected String tecnico;
    protected int titulos;
    
    @JoinColumn
    @ManyToOne
    private Grafico grafico;
    
    @OneToMany(mappedBy="time",fetch=FetchType.EAGER,cascade=CascadeType.REMOVE)
	private List<Jogador> jogadores;

    /**
     * Gets the value of the escudo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscudo() {
        return escudo;
    }

    /**
     * Sets the value of the escudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscudo(String value) {
        this.escudo = value;
    }

    /**
     * Gets the value of the estadio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * Sets the value of the estadio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadio(String value) {
        this.estadio = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the tecnico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTecnico() {
        return tecnico;
    }

    /**
     * Sets the value of the tecnico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTecnico(String value) {
        this.tecnico = value;
    }

    /**
     * Gets the value of the titulos property.
     * 
     */
    public int getTitulos() {
        return titulos;
    }

    /**
     * Sets the value of the titulos property.
     * 
     */
    public void setTitulos(int value) {
        this.titulos = value;
    }

	public Grafico getGrafico() {
		return grafico;
	}

	public void setGrafico(Grafico grafico) {
		this.grafico = grafico;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

}
