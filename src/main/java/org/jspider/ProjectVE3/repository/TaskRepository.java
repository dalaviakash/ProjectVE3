package org.jspider.ProjectVE3.repository;

import org.jspider.ProjectVE3.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {


}
