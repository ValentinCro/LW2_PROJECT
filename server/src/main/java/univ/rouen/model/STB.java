package univ.rouen.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "STB")
@XmlAccessorType(XmlAccessType.NONE)
public class STB implements Serializable{

    private static int STB_ID = 0;

    @XmlElement
    private int id;

    @XmlElement
    private String title;

    @XmlElement
    private double version;

    @XmlElement
    private String date;

    @XmlElement
    private String description;

    @XmlElement
    private List<Equipe> equipeList;

    @XmlElement
    private List<Client> clientList;

    @XmlElement
    private List<Fonctionnalite> fonctionnaliteList;

    @XmlElement
    private String commentaire;

    public STB() {
        this.equipeList = new ArrayList<Equipe>();
        this.clientList = new ArrayList<Client>();
        this.fonctionnaliteList = new ArrayList<Fonctionnalite>();
        this.id = STB_ID;
        STB_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static int getStbId() {
        return STB_ID;
    }

    public static void setStbId(int stbId) {
        STB_ID = stbId;
    }

    public List<Equipe> getEquipeList() {
        return equipeList;
    }

    public void setEquipeList(List<Equipe> equipeList) {
        this.equipeList = equipeList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Fonctionnalite> getFonctionnaliteList() {
        return fonctionnaliteList;
    }

    public void setFonctionnaliteList(List<Fonctionnalite> fonctionnaliteList) {
        this.fonctionnaliteList = fonctionnaliteList;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
