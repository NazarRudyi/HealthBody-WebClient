
package edu.softserveinc.healthbody.webclient.healthbody.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userCompetitionsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userCompetitionsDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAwards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCompetition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUserCompetition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userCompetitionsDTO", propOrder = {
    "idAwards",
    "idCompetition",
    "idUser",
    "idUserCompetition",
    "timeReceived",
    "userScore"
})
public class UserCompetitionsDTO {

    protected String idAwards;
    protected String idCompetition;
    protected String idUser;
    protected String idUserCompetition;
    protected String timeReceived;
    protected String userScore;

    /**
     * Gets the value of the idAwards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAwards() {
        return idAwards;
    }

    /**
     * Sets the value of the idAwards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAwards(String value) {
        this.idAwards = value;
    }

    /**
     * Gets the value of the idCompetition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCompetition() {
        return idCompetition;
    }

    /**
     * Sets the value of the idCompetition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCompetition(String value) {
        this.idCompetition = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUser(String value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the idUserCompetition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUserCompetition() {
        return idUserCompetition;
    }

    /**
     * Sets the value of the idUserCompetition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUserCompetition(String value) {
        this.idUserCompetition = value;
    }

    /**
     * Gets the value of the timeReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeReceived() {
        return timeReceived;
    }

    /**
     * Sets the value of the timeReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeReceived(String value) {
        this.timeReceived = value;
    }

    /**
     * Gets the value of the userScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserScore() {
        return userScore;
    }

    /**
     * Sets the value of the userScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserScore(String value) {
        this.userScore = value;
    }

}
