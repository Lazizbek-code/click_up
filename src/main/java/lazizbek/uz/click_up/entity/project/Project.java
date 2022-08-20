package lazizbek.uz.click_up.entity.project;

import lazizbek.uz.click_up.entity.space.Space;
import lazizbek.uz.click_up.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    private Space space;

    private Boolean accessType;

    private Boolean archived;

    @Column(nullable = false)
    private String color;
}
