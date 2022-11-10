package academy.learnprogramming.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 *
 * @author KonstantinosK
 *
 */
@Entity
public class Todo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String task;
    private LocalDate dueDate;
    private boolean isCompleted;
    private LocalDate dateCompleted;
    private LocalDate dateCreated;
    
    @PrePersist
    private void init() {
        setDateCompleted(LocalDate.now());
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTask() {
        return task;
    }
    
    public void setTask(String task) {
        this.task = task;
    }
    
    public LocalDate getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    
    public boolean isIsCompleted() {
        return isCompleted;
    }
    
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    
    public LocalDate getDateCompleted() {
        return dateCompleted;
    }
    
    public void setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
    
    public LocalDate getDateCreated() {
        return dateCreated;
    }
    
    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
    
}
