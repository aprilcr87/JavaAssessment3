package parsing_json;


import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;


public class ElementCollectionInitializer {
    public static ElementCollection generate() throws IOException{
        Gson gson = new Gson();
        try {
            String path = "/Users/aprilrivera/Dev/JavaAssessment3/src/main/resources/periodic_table.json";
            BufferedReader br = new BufferedReader(new FileReader(path));
            Type type = new TypeToken<ElementCollection>(){}.getType();
            ElementCollection elements = gson.fromJson(br, type);
            return elements;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}




