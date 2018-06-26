package gson;

import bean.Diaosi;
import bean.DiaosiWithBirthday;
import com.google.gson.Gson;

import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

public class GsonReadSample {

    public  static void main(String[] args) throws IOException {
        File file = new File("D:"+File.separator+"studyjson"+File.separator+"wangxiaoer.json");
        String content = FileUtils.readFileToString(file);
        //使用json反解析，通过原始的json数据格式--生成Diaosi Javabean
        //创建gson对象


        //  Gson gson = new Gson();
        //public <T> T fromJson(String json, Class<T> classOfT)--Class<T> classOfT 需要传唤成的json对象
        //通过一行代码把gson对象进行反解析，而反解析的内容，它的一个映射关系：通过javaben Diaosi中的属性和
        //wangxiaoer.json文件里对应的这个key,对应不上就是空。
        //  Diaosi wangxiaoer = gson.fromJson(content,Diaosi.class);
        // System.out.println(wangxiaoer);


        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        DiaosiWithBirthday wangxiaoer = gson.fromJson(content,DiaosiWithBirthday.class);
        System.out.println(wangxiaoer.getBirthday().toLocaleString());
        System.out.println(wangxiaoer.getMajor());
        System.out.println(wangxiaoer.getMajor().getClass());



    }

}
