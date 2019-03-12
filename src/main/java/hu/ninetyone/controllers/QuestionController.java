package hu.ninetyone.controllers;

import hu.ninetyone.entities.Notes;
import hu.ninetyone.entities.Question;
import hu.ninetyone.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;


    @GetMapping("")
    public ResponseEntity<Iterable<Question>> getAll() {
        return ResponseEntity.ok(questionRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> get(@PathVariable Integer id) {
        Optional<Question> question = questionRepository.findById(id);
        if (question.isPresent()) {
            return ResponseEntity.ok(question.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("")
    public ResponseEntity<Question> post(@RequestBody Question question) {
        Question savedQuestion = questionRepository.save(question);
        return ResponseEntity.ok(savedQuestion);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Question> delete(@PathVariable Integer id) {
        Optional<Question> optQuestion = questionRepository.findById(id);
        if (optQuestion.isPresent()) {
            questionRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}