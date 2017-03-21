package com.bb.events.app.evts.util;

import com.bb.events.app.evts.util.IgnoreFieldStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by bilge on 21/03/17.
 */
public final class HttpUtil {

    public static Object getURLAsJson(Type clazz, String urlStr) {
        Gson gson = new GsonBuilder()
                .setExclusionStrategies(new IgnoreFieldStrategy())
                .create();

        Object resp = null;
        try {
            StringBuilder result = new StringBuilder();
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            resp = gson.fromJson(result.toString(), clazz);
            rd.close();
        }
        catch(Exception exc)
        {
            System.out.println("Error encountered while processing json message: "+ exc.getMessage());
        }
        finally
        {

        }
        return resp;
    }

    public static Object getURLAsXML(XStream xStream, String urlStr) {

        Object resp = null;
        try {
            StringBuilder result = new StringBuilder();
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            resp = xStream.fromXML(result.toString());
            rd.close();
        }
        catch(Exception exc)
        {
            System.out.println("Error encountered while processing xml message: "+ exc.getMessage());
        }
        finally
        {

        }
        return resp;
    }

}
