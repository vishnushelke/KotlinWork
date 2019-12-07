import com.bridgelabz.oops.model.InventoryDetails;
import com.bridgelabz.oops.model.Rice;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class practice {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InventoryDetails model = new InventoryDetails();
        String inFile = "/home/user/Desktop/vishnu/ideaIC-2019.3/KotlinPrograms/inventoryDetails.json";
        String outPath = "/home/user/Desktop/vishnu/ideaIC-2019.3/KotlinPrograms/inventoryDetailsOut.json";
        model = mapper.readValue(new File(inFile),InventoryDetails.class);
        ArrayList<Rice> rices = model.getRices();
        System.out.print(rices.get(0).getName());
    }
}
