package com.onfish.yshyheartbeatcollectionreport.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.onfish.yshyheartbeatcollectionreport.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-07-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_tx_exception")
public class TTxException extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String groupId;

    private String unitId;

    private String modId;

    private Integer transactionState;

    private Integer registrar;

    private String remark;

    /**
     * 0 未解决 1已解决
     */
    private Integer exState;

    private LocalDateTime createTime;


}
