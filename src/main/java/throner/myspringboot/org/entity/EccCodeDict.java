package throner.myspringboot.org.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 公司字典表
 * </p>
 *
 * @author throner
 * @since 2020-06-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EccCodeDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代码
     */
    @TableId("CODE")
    private String code;

    /**
     * 值
     */
    @TableField("VALUE")
    private String value;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 配置组
     */
    @TableField("GROUP_ID")
    private String groupId;

    /**
     * 所属模块
     */
    @TableField("MODULE")
    private String module;

    /**
     * 状态
     */
    @TableField("STS")
    private String sts;

    /**
     * 公司ID
     */
    @TableField("COMPANY_ID")
    private String companyId;

    /**
     * 展示顺序
     */
    @TableField("ORDER_NUM")
    private BigDecimal orderNum;

    @TableField("CREATE_STAFF_ID")
    private String createStaffId;

    @TableField("CREATE_TIME")
    private Date createTime;


}
