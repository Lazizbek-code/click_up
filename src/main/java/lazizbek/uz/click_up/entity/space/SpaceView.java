package lazizbek.uz.click_up.entity.space;

import lazizbek.uz.click_up.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SpaceView extends AbstractEntity {
    @ManyToOne(optional = false)
    private Space space;

    @ManyToOne(optional = false)
    private View view;
}
