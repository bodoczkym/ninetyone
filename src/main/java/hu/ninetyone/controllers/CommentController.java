package hu.ninetyone.controllers;

import hu.ninetyone.entities.Comment;
import hu.ninetyone.entities.Question;
import hu.ninetyone.repositories.CommentRepository;
import hu.ninetyone.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/questions/comments")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;


    @GetMapping("")
    public ResponseEntity<Iterable<Comment>> getAll() {
        return ResponseEntity.ok(commentRepository.findAll());
    }



    @PostMapping("")
    public ResponseEntity<Comment> post(@RequestBody Comment comment) {
        System.out.println(comment);
        Comment savedComment = commentRepository.save(comment);
        return ResponseEntity.ok(savedComment);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Comment> delete(@PathVariable Integer id) {
        Optional<Comment> optComment = commentRepository.findById(id);
        if (optComment.isPresent()) {
            commentRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
