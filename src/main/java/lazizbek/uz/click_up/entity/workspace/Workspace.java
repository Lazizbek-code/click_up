package lazizbek.uz.click_up.entity.workspace;

import lazizbek.uz.click_up.entity.Attachment;
import lazizbek.uz.click_up.entity.User;
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
public class Workspace extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    private String color;

    private String initialLetter;

    @OneToOne(fetch = FetchType.LAZY)
    private Attachment avatar;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User owner;
}
