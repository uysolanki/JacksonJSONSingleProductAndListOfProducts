import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDriver {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
        
//		ObjectMapper objectMapper = new ObjectMapper();
//
//        File file = new File("e:/jsondata/product.json");
//
//        Product testObj1 = objectMapper.readValue(file, Product.class);
//        System.out.println(testObj1.getPrice());
        
        
        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File("e:/jsondata/products.json");

        List<Product> products = Arrays.asList(objectMapper.readValue(file, Product[].class));
        System.out.println(products.get(0).getTitle());

	}

}
