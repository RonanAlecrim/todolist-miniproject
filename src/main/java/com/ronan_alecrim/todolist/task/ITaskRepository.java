package com.ronan_alecrim.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.annotation.Target;
import java.util.List;
import java.util.UUID;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByIdUser(UUID idUser);

}

