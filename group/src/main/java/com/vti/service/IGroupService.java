package com.vti.service;

import com.vti.entity.Group;

import java.util.List;

public interface IGroupService {
    List<Group> findall();
    Group findById(int id);
    void createGroup(Group group);
    void deleteById(int id);
    void updateGroup(Group group);
    void deleteGroup(Group group);
}
