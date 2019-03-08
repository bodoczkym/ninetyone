package hu.ninetyone.controllers;

import hu.ninetyone.entities.Notes;
import hu.ninetyone.repositories.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/notes")
public class NotesController {
    @Autowired
    private NotesRepository notesRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Notes>> getAll() {
        return ResponseEntity.ok(notesRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notes> get(@PathVariable Integer id) {
        Optional<Notes> note = notesRepository.findById(id);
        if (note.isPresent()) {
            return ResponseEntity.ok(note.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("")
    public ResponseEntity<Notes> post(@RequestBody Notes note) {
        Notes savedNote = notesRepository.save(note);
        return ResponseEntity.ok(savedNote);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Notes> delete(@PathVariable Integer id) {
        Optional<Notes> optNote = notesRepository.findById(id);
        if (optNote.isPresent()) {
            notesRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
