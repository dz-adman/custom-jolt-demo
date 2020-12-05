package com.example.Transform;

import java.util.Map;

import com.bazaarvoice.jolt.Transform;

public class CustomNameTransform implements Transform {

	@Override
	public Object transform(Object input) {
		
		String nameString = ((Map<String, String>) input).get("name"); 
		
        // Todo
        // Your custom date manipulation logic.
        String fixedName = "This is the new Name";
        
        System.out.println(fixedName);

        // Overwrite the old value with the new / fixed one.
        ((Map) input).put("newName", fixedName);
        
        return fixedName;
	}

}
