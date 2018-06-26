package bean;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
public class DiaosiWithBirthday {
    private String name;
    private String school;
    private boolean has_girlfriends;
    private double age;
    private Object car;
    private Object house;
    //private String[] major;
    private Set<String> major;
    private String comment;
    private Date birthday;

}
