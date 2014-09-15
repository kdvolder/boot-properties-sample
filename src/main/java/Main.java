import java.io.IOException;
import java.util.Map.Entry;

import org.springframework.boot.config.ConfigMetadataItem;
import org.springframework.boot.config.ConfigMetadataRepository;
import org.springframework.boot.config.support.ConfigMetadataRepositoryJsonLoader;

// Note: To build and run this, need to ...
// Need to get dependencies by building spring-boot from snicoll's github clone on branch
//  gh-1001

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		ConfigMetadataRepositoryJsonLoader loader = new ConfigMetadataRepositoryJsonLoader();
		
		ConfigMetadataRepository repo = loader.loadFromClasspath();
		for (Entry<String, ConfigMetadataItem> entry : repo.getAllItems().entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
			ConfigMetadataItem item = entry.getValue();
		}
		
	}

}
