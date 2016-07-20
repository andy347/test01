package qoo.maven_demo;
import org.apache.commons.lang3.*;

public class diff {
public String getDiff(String str1,String str2) throws Exception {
	if ((StringUtils.isEmpty(str1)) || (StringUtils.isEmpty(str2)))
	throw new Exception("Qoo");
	return StringUtils.difference(str1, str2);

	
	
	
}
	
}
