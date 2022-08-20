package lazizbek.uz.click_up.entity.category;

import lazizbek.uz.click_up.entity.User;
import lazizbek.uz.click_up.entity.enums.ProjectPermissionName;
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
public class CategoryUser extends AbstractEntity {
    @ManyToOne(optional = false)
    private Category category;

    @ManyToOne(optional = false)
    private User user;

    @Enumerated(value = EnumType.STRING)
    private ProjectPermissionName permissionNames;
}