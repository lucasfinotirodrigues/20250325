package application.service;

import application.repository.AutorRepository;
import org.springframework.stereotype.Service;
import application.model.Autor;
import application.record.AutorDTO;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepo;

    public AutorDTO insert(AutorDTO dados) {
        return new AutorDTO(autorRepo.save(new Autor(dados)));
    }
}