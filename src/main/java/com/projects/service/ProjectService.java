package com.projects.service;

import com.projects.entity.Project;
import com.projects.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    public Project addOrUpdate(Project p) {
        return projectRepository.save(p);
    }

    public void delete(Long id) {

        projectRepository.deleteById(id);
    }


}
