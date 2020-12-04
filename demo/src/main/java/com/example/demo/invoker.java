package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

@RestController
public class invoker {
	
	@RequestMapping(path="/", consumes = "!application/json")
	public String invoke()
	{
		List chainrSpecJSON = JsonUtils.classpathToList( "/json/sample/spec.json" );
        Chainr chainr = Chainr.fromSpec( chainrSpecJSON );
        
        Object inputJSON = JsonUtils.classpathToObject( "/json/sample/input.json" );
        
        Object transformedOutput = chainr.transform( inputJSON );
        return JsonUtils.toJsonString( transformedOutput);
	}

}
