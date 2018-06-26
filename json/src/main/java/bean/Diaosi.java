package bean;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Diaosi {
   // @SerializedName("name")
    private String name;
    private String school;
    private boolean has_girlfriends;
    private double age;
    private Object car;
    private Object house;
    private String[] major;
    private String comment;
    private String birthday;



}
