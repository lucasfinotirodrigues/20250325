package application.controller;
 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
 
import application.record.AutorDTO;
import application.service.AutorService;


@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;
 
    @PostMapping
    public AutorDTO insert(@RequestBody AutorDTO autor) {
        return autorService.insert(autor);
    }
 
}