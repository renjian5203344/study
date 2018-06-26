package gson;
import bean.Diaosi;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;

public class GsonCreateSample {
    public static void main(String[] args) {
        Object nullObj = null;
        Diaosi wangxiaoer = new Diaosi();
        wangxiaoer.setName("王小二");
        wangxiaoer.setAge(25.2);
        wangxiaoer.setBirthday("1990-01-01");
        wangxiaoer.setSchool("蓝翔");
        wangxiaoer.setMajor(new String[]{" 理发", "挖掘机"});
        wangxiaoer.setHas_girlfriends(false);
        wangxiaoer.setHouse(nullObj);
        wangxiaoer.setCar(nullObj);
        wangxiaoer.setComment("这是一个注释");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {//传入回调函数，做一些额外的事情
                                               public String translateName(Field field) {//重写 translateName  Field在反射里面就是反射的一个对象
                                                   if (field.getName().equals("name")) {
                                                       return "NAME";

                                                   }
                                                   return field.getName();
                                               }

                                           });

        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(wangxiaoer));
      //  Gson gson = new Gson();
       // System.out.println(gson.toJson(wangxiaoer));
    }
}
