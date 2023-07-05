package sg.edu.nus.iss.paf_day6.repo;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ShowsRepo {
    
    @Autowired
    private MongoTemplate template;

    public static final String F_Name = "name";
    public static final String C_TVSHOW = "tvshow";

    public List<Document> findShowsByName(String programName) {

        //Set filter
        Criteria criteria = Criteria.where("name").is(programName);

        //Create Mongo query w/ filter
        Query query = Query.query(criteria);

        //Perform query
        return template.find(query, Document.class, "tvshow");
    }

}
