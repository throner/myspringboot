package throner.myspringboot.org.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author throner
 * @since 2020-06-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    private String staffName;

    private String staffId;

    private String deptId;

    /**
     * 公司ID
     */
    private String companyId;


}
