package lv.tele2.javaschool.phoneBook;

import java.io.Serializable;

/**
 * Created by andrkuli on 07.03.2017.
 */
public class Record implements Serializable{
    private static final long serialVersionUID = 1L;

    private static int nextId = 1;

    private int id;
    private String name;
    //add more than one phone number to a record
    //private List<String> phone = new ArrayList<>;
    private String phone;
    private String eMail;

    public Record(){
        this.id = nextId;
        nextId++;
    }

    public Record(String name, String phone, String eMail){
        this();
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String geteMail() { return eMail; }

    public void seteMail(String eMail) { this.eMail = eMail; }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
