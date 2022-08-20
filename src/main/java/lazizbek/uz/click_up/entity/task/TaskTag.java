package lazizbek.uz.click_up.entity.task;

import lazizbek.uz.click_up.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TaskTag extends AbstractEntity {
    @ManyToOne(optional = false)
    private Task task;

    @ManyToOne(optional = false)
    private Tag tag;
}
