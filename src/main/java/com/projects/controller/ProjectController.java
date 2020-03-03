package com.projects.controller;

import com.projects.entity.Project;
import com.projects.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> getAll() {
        return  projectService.getAll();
    }

    @PostMapping("/projects")
    public Project addOrUpdate(@Valid @RequestBody Project p) {
        return  projectService.addOrUpdate(p);
    }

    @DeleteMapping("/projects/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        projectService.delete(id);
    }


}
