package com.vti.controller;

import com.vti.entity.Group;
import com.vti.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/groups")
public class GroupController {
    @Autowired
    private IGroupService service;

    @GetMapping
    public List<Group> findAllGroup(){
        return service.findall();
    }

    @GetMapping("/{id}")
    public Group findById(@PathVariable(name = "id") int id) {
        return service.findById(id);
    }

    @PostMapping
    public void createGroup(@RequestBody Group group) {
        service.createGroup(group);
    }

    @PutMapping("/{id}")
    public void updateGroup(@PathVariable("id") int id, @RequestBody Group group) {
        service.createGroup(group);
        group.setId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable(name = "id") int id) {
        service.deleteById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable(name = "id") int id, @RequestBody Group group) {
        service.deleteGroup(group);
    }
}
