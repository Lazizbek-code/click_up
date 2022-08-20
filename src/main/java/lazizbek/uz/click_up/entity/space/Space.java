package lazizbek.uz.click_up.entity.space;

import lazizbek.uz.click_up.entity.Attachment;
import lazizbek.uz.click_up.entity.Icon;
import lazizbek.uz.click_up.entity.User;
import lazizbek.uz.click_up.entity.workspace.Workspace;
import lazizbek.uz.click_up.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Space extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @ManyToOne(optional = false)
    private Workspace workspace;

    private String initialLetter;

    @OneToOne
    private Icon icon = null;

    @OneToOne
    private Attachment avatar = null;

    @ManyToOne(optional = false)
    private User owner;

    private Boolean isPrivate;

}
