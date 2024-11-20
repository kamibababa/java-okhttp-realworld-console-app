package org.example;

import com.alibaba.fastjson2.JSONObject;
import org.example.utils.OkHttpUtils;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        //post请求
//        HashMap<Object, Object> map = new HashMap<>();
//        map.put("password","123666");
//        map.put("email","jake666@jake666.jake");
//        map.put("username","Jacob666");
//        HashMap<Object, Object> map2 = new HashMap<>();
//        map2.put("user",map);
//        JSONObject object = new JSONObject(map2);
//        String url = "https://conduit-api.bondaracademy.com/api/users";
//        String data = OkHttpUtils.builder().url(url).addObject(object).sync();
//        System.out.println(data);


//        String url = "https://conduit-api.bondaracademy.com/api/user";
//        String token = "Token eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImlkIjoxMzQyMX0sImlhdCI6MTczMjA3MzIwNywiZXhwIjoxNzM3MjU3MjA3fQ.W8qBKijaNqv90000iVOHewwRzHI67rA9Lz8fy5aicXg";
//        String data = OkHttpUtils.builder().url(url).get().addHeader("Authorization", token).sync();
//        System.out.println(data);

        //get请求
//        String url = "https://conduit-api.bondaracademy.com/api/articles?tag=YouTube";
////        String token = "Token eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImlkIjoxMzQyMX0sImlhdCI6MTczMjA3MzIwNywiZXhwIjoxNzM3MjU3MjA3fQ.W8qBKijaNqv90000iVOHewwRzHI67rA9Lz8fy5aicXg";
//        String data = OkHttpUtils.builder().url(url).get().sync();
//        System.out.println(data);

        //        //post请求
        HashMap<Object, Object> map = new HashMap<>();
        map.put("title","123666");
        map.put("description","jake666@jake666.jake");
        map.put("body","Jacob666");
        map.put("tagList","[\"reactjs\", \"angularjs\", \"dragons\"]");
        HashMap<Object, Object> map2 = new HashMap<>();
        map2.put("article",map);
        JSONObject object = new JSONObject(map2);
        String token = "Token eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImlkIjoxMjk0N30sImlhdCI6MTczMjA3MzQwMiwiZXhwIjoxNzM3MjU3NDAyfQ.tDtXS-N0AUT34P5vy542IIJreIXbZydN48jvUpyVKWM";
        String url = "https://conduit-api.bondaracademy.com/api/articles";
        String data = OkHttpUtils.builder().url(url).addObject(object).addHeader("Authorization",token).sync();
        System.out.println(data);

    }
}
