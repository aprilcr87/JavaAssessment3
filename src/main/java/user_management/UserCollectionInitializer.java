package user_management;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;

public class UserCollectionInitializer {
    public static UserCollection generate() throws IOException{
        Gson gson = new Gson();
        try {
            String path = "/Users/aprilrivera/Dev/JavaAssessment3/src/main/resources/users.json";
            BufferedReader br = new BufferedReader(new FileReader(path));
            Type type = new TypeToken<UserCollection>(){}.getType();
            UserCollection uc = gson.fromJson(br, type);
            return uc;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
