package om.binking.beeradviser;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by BinKing on 2016/5/7.
 */
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("Deep")) {
            brands.add("深蓝");
            brands.add("深海");
        } else if (color.equals("Light")){
            brands.add("Light Speed");
            brands.add("Light Thunder");
        }else if (color.equals("Green")){
            brands.add("Green Leaf");
            brands.add("Green Tea");
        }else{
            brands.add("Blue Love");
            brands.add("Blue Water");
        }
        return brands;
    }
}
