package com.Project.ShowDekho.Controllers;

import com.Project.ShowDekho.Model.Cast;
import com.Project.ShowDekho.Service.CastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CastController {
    private final CastService castService;

    @Autowired
    public CastController(CastService castService) { this.castService = castService; }

    @PostMapping(value = "showdekho.com/cast/insert")
    public ResponseEntity<Cast> registerNewCast(@RequestBody Cast cast){
        Cast currCast = castService.addNewCast(cast);
        return ResponseEntity.ok(currCast);
    }

    @GetMapping(value = "showdekho.com/cast/get")
    public List<Cast> getCast(){
        return castService.getAllCast();
    }

    @GetMapping(value = "showdekho.com/cast/castId")
    public List<Cast> getcastByCastId(@RequestBody Integer cast_id){
        return castService.getCastById(cast_id);
    }
}
