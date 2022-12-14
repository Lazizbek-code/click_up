package lazizbek.uz.click_up.entity.task;

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
public class CheckList extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Task task;
}
