package hu.ninetyone.controllers;

import hu.ninetyone.entities.Job;
import hu.ninetyone.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private JobRepository jobRepository;



    @GetMapping("")
    public ResponseEntity<Iterable<Job>> getAll() {
        return ResponseEntity.ok(jobRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> get(@PathVariable Integer id) {
        Optional<Job> job = jobRepository.findById(id);
        if (job.isPresent()) {
            return ResponseEntity.ok(job.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("")
    public ResponseEntity<Job> post(@RequestBody Job job) {
        Job savedJob = jobRepository.save(job);
        return ResponseEntity.ok(savedJob);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Job> delete(@PathVariable Integer id) {
        Optional<Job> optJob = jobRepository.findById(id);
        if (optJob.isPresent()) {
            jobRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
