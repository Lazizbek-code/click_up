package lazizbek.uz.click_up.entity.task;

import lazizbek.uz.click_up.entity.template.AbstractEntity;
import lazizbek.uz.click_up.entity.workspace.Workspace;
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
public class Tag extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    private String color;

    @ManyToOne
    private Workspace workspace;
}
