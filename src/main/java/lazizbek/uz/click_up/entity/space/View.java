package lazizbek.uz.click_up.entity.space;

import lazizbek.uz.click_up.entity.Icon;
import lazizbek.uz.click_up.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class View extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @OneToOne
    private Icon icon;
}
