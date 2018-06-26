package json;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
public class ReadJsonSample {
    public static void main(String[] args) throws IOException, JSONException {
        //从文件中获取json对象
        //1、声明要读取的json文件
       // File file = new File(ReadJsonSample.class.getResource("/wangxiaoer.json").getFile());
        File file = new File("D:"+File.separator+"studyjson"+File.separator+"wangxiaoer.json");
        //2、读取文件内容
        String content = FileUtils.readFileToString(file);
        //3、将读取的内容转化成JSONObject对象
        JSONObject jsonObject = new JSONObject(content);
        if(!jsonObject.isNull("name")){
            System.out.println("姓名:"+jsonObject.getString("name"));

        }
        if(!jsonObject.isNull("nickname")){
            System.out.println("姓名:"+jsonObject.getString("nickname"));

        }


        System.out.println("年龄:"+jsonObject.getDouble("age"));
        System.out.println("是否有女朋友？"+jsonObject.getBoolean("has_girlfriends"));


        JSONArray jsonArray = jsonObject.getJSONArray("major");
        //jsonArray就是json当中的一个数组
        for(int i = 0; i<jsonArray.length();i++){
           String str = (String) jsonArray.get(i);//把数组强制转换为String类型
            System.out.println("专业:"+(i+1)+str);
        }

    }
}
