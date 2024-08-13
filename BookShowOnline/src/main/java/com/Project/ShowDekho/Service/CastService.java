package com.Project.ShowDekho.Service;

import com.Project.ShowDekho.Model.Cast;
import com.Project.ShowDekho.Repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CastService {
    private final CastRepository castRepository;

    @Autowired
    public CastService(CastRepository castRepository) { this.castRepository = castRepository; }
    public Cast addNewCast(Cast cast) {
        cast.setCreatedAt(LocalDateTime.now());
        cast.setUpdatedAt(LocalDateTime.now());
        return castRepository.save(cast);
    }

    public List<Cast> getAllCast(){
        return castRepository.findAll();
    }

    public List<Cast> getCastById(Integer cast_id){
        return castRepository.findCastByCastId(cast_id);
    }
}
