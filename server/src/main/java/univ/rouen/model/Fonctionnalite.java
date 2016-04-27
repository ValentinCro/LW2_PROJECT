package univ.rouen.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Equipe")
@XmlAccessorType(XmlAccessType.NONE)
public class Fonctionnalite {

    @XmlElement
    private String description;

    @XmlElement
    private List<ExigenceFonctionnelle> exigenceFonctionnelle;

    public Fonctionnalite() {
        exigenceFonctionnelle = new ArrayList<ExigenceFonctionnelle>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ExigenceFonctionnelle> getExigenceFonctionnelle() {
        return exigenceFonctionnelle;
    }

    public void setExigenceFonctionnelle(List<ExigenceFonctionnelle> exigenceFonctionnelle) {
        this.exigenceFonctionnelle = exigenceFonctionnelle;
    }
}
