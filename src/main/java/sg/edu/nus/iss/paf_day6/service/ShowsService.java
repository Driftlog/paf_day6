package sg.edu.nus.iss.paf_day6.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.paf_day6.model.Show;
import sg.edu.nus.iss.paf_day6.repo.ShowsRepo;

@Service
public class ShowsService {
    
    @Autowired
    private ShowsRepo repo;

    public Show getShowById(String showName) {
            Optional<Show> searchResult = repo.findShowsByName(showName);
            
            if (searchResult.isPresent()) {
                
            }

            return null;
    }
}
