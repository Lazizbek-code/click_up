package lazizbek.uz.click_up.entity.project;

import lazizbek.uz.click_up.entity.User;
import lazizbek.uz.click_up.entity.enums.ProjectPermissionName;
import lazizbek.uz.click_up.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectUser extends AbstractEntity {
    @ManyToOne(optional = false)
    private Project project;

    @ManyToOne(optional = false)
    private User user;

    @Enumerated(value = EnumType.STRING)
    private ProjectPermissionName permissionNames;
}
