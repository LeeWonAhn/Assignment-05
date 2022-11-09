package com.vti.service;

import com.vti.entity.Group;
import com.vti.repository.IGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService implements IGroupService {

    @Autowired
    private IGroupRepository repository;

    @Override
    public List<Group> findall() {
        return null;
    }

    @Override
    public Group findById(int id) {
        return null;
    }

    @Override
    public void createGroup(Group group) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updateGroup(Group group) {

    }

    @Override
    public void deleteGroup(Group group) {

    }
}
