package lv.tele2.javaschool.phoneBook;

import asg.cliche.Command;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrkuli on 07.03.2017.
 */
public class PhoneBook implements Serializable {
    private static final long serialVersionUID=1L;
    private List<Record> recordList = new ArrayList<>();

    @Command
    public void create(String name, String phone, String eMail){ //String... phone
        Record r = new Record(name,phone,eMail);
//        r.setName(name);
//        r.setPhone(phone);
//        r.seteMail(eMail);
        recordList.add(r);
    }

    @Command
    public List<Record> list(){
        return recordList;
    }

//    @Command
//    public void addPhone(int id, String phone) {
//
//    }
}
