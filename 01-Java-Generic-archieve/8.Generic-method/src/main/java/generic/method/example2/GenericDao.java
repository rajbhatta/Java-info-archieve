package generic.method.example2;

import java.util.List;

public class GenericDao {

    public  <T> T updateData(T t){
        //TODO: utilize t
        return t;
    }

    public  <T> T delete(T t){
        //TODO: utilize t
        return t;
    }

    public  <T> Boolean save(T t){
        boolean success = false;
        try{

            //TODO: utilize t
            success = true;
        }catch(Exception e){
            success = false;
            return success;
        }
        return success;
    }

    public  <T> List<T> listData(String className){
        List<T> items = null;

        //TODO: utilize T

        return items;
    }

}
