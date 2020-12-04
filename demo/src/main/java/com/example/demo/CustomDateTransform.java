package com.example.demo;

import java.util.Map;

//import com.bazaarvoice.jolt.JoltTransform;
import com.bazaarvoice.jolt.Transform;

public class CustomDateTransform implements Transform {
	
	@Override
	public Object transform( Object input ) {
        // Grab the date out of the incoming Json data / Map
        String dateString = ((Map<String, String>) input).get("dDate"); 

        // Todo
        // Your custom date manipulation logic.
        String fixedDate = "This is the new date";
        

        // Overwrite the old value with the new / fixed one.
        ((Map) input).put("newDate", fixedDate);
        
        return fixedDate;
    }

}
