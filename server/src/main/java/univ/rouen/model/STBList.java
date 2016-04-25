package univ.rouen.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="STBList")
public class STBList implements Serializable{

    private List<STB> list = new ArrayList<STB>();

    public List<STB> getList() {
        return list;
    }

    public void setList(List<STB> list) {
        this.list = list;
    }

    public void addElement(STB elem) {
        this.list.add(elem);
    }
}
