package sg.edu.nus.iss.paf_day6;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sg.edu.nus.iss.paf_day6.repo.ShowsRepo;

@SpringBootApplication
public class PafDay6Application  implements CommandLineRunner{

	@Autowired
	private ShowsRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(PafDay6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Document> docs = repo.findShowsByName("Bitten");
		for (Document d : docs) {
			String name = d.getString("name");
			String type = d.getString("type");
			Integer runtime = d.getInteger("runtime");
			List<String> genres = d.getList("genres", String.class);

			//get rating object
			Document rateDoc = d.get("rating", Document.class);
			Double avg = rateDoc.getDouble("average");
			rateDoc.getDouble("average");

			System.out.println(name);
			System.out.println(type);
			System.out.println(runtime);
			System.out.println(genres);
		}
	}


}
