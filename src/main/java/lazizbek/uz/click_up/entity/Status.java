package lazizbek.uz.click_up.entity;

import lazizbek.uz.click_up.entity.category.Category;
import lazizbek.uz.click_up.entity.enums.StatusType;
import lazizbek.uz.click_up.entity.project.Project;
import lazizbek.uz.click_up.entity.space.Space;
import lazizbek.uz.click_up.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Status extends AbstractEntity {
    private String name;

    @Column(nullable = false)
    private String color;

    @ManyToOne
    private Space space;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Category category;

    @Enumerated(value = EnumType.STRING)
    private StatusType statusTypes;
}
