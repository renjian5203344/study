package json;

import bean.Diaosi;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class JsonObjectSample {
    public static void main(String [] args){
        jSONObjectsimple();
        createJsonByMap();
        createJsonByBean();


    }
    /***
     * {
     *   "name" : "王小二",
     *   "age" : 25.2,
     *   "birthday" : "1990-01-01",
     *   "school" : "蓝翔",
     *   "major" : ["理发","挖掘机"],
     *   "has_girlfriends" : false,
     *   "car" : null,
     *   "house" : null,
     *   "comment" :"这是一个注释"
     * }

     */
//创建JSONObject静态方法
    private static void jSONObjectsimple() {
        JSONObject wangxiaoer = new JSONObject();
        Object nullObject = null;
       // put方法有不同类型的方法重载
        try {
            wangxiaoer.put("name","王小二");
            wangxiaoer.put("age",25.2);
            wangxiaoer.put("birthday","1990-01-01");
            wangxiaoer.put("school","蓝翔");
            wangxiaoer.put("major",new String[]{" 理发","挖掘机"});
            wangxiaoer.put("has_girlfriends",false);
            wangxiaoer.put("car",nullObject);//put这个方法，重载了两个不同的value的属性，因此传入null的时候，会有一个二义性。
            wangxiaoer.put("house",nullObject);
            wangxiaoer.put("comment","这是一个注释");
            System.out.println(wangxiaoer.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private   static void createJsonByMap(){
        HashMap<String,Object> wangxiaoer = new HashMap<String, Object>();
        Object nullObject = null;
        wangxiaoer.put("name","王小二");
        wangxiaoer.put("age",25.2);
        wangxiaoer.put("birthday","1990-01-01");
        wangxiaoer.put("school","蓝翔");
        wangxiaoer.put("major",new String[]{" 理发","挖掘机"});
        wangxiaoer.put("has_girlfriends",false);
        wangxiaoer.put("car",nullObject);//put这个方法，重载了两个不同的value的属性，因此传入null的时候，会有一个二义性。
        wangxiaoer.put("house",nullObject);
        wangxiaoer.put("comment","这是一个注释");
        System.out.println(new JSONObject(wangxiaoer).toString());


    }


    private static void createJsonByBean(){
        Object nullObj = null;
        Diaosi wangxiaoer = new Diaosi();
        wangxiaoer.setName("王小二");
        wangxiaoer.setAge(25.2);
        wangxiaoer.setBirthday("1990-01-01");
        wangxiaoer.setSchool("蓝翔");
        wangxiaoer.setMajor(new String[] {" 理发" , "挖掘机"});
        wangxiaoer.setHas_girlfriends(false);
        wangxiaoer.setHouse(nullObj);
        wangxiaoer.setCar(nullObj);
        wangxiaoer.setComment("这是一个注释");


        System.out.println(new JSONObject(wangxiaoer));




    }
}
