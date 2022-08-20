package lazizbek.uz.click_up.entity.task;

import lazizbek.uz.click_up.entity.Status;
import lazizbek.uz.click_up.entity.category.Category;
import lazizbek.uz.click_up.entity.template.AbstractEntity;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
public class Task extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @ManyToOne(optional = false)
    private Category category;

    @ManyToOne(optional = false)
    private Status status;

    private Integer orderNum;

    @ManyToOne
    private Priority priority;

    @ManyToOne
    private Task parentTask;

    @CreationTimestamp
    @Column(updatable = false, nullable = false)
    private Timestamp startedDate;

    private Boolean startTimeHas;

    @UpdateTimestamp
    private Timestamp dueDate;

    private Boolean dueTimeHas;

    private Long estimateTime;

    private Timestamp activeDate;
}
