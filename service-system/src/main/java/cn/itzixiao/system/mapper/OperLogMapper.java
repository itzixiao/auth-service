package cn.itzixiao.system.mapper;

import cn.itzixiao.model.system.SysLoginLog;
import cn.itzixiao.model.system.SysOperLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author itzixiao
 * @since 2022-09-28
 */
@Repository
@Mapper
public interface OperLogMapper extends BaseMapper<SysOperLog> {

}
