package cn.itzixiao.system.mapper;

import cn.itzixiao.model.system.SysLoginLog;
import cn.itzixiao.model.system.SysUser;
import cn.itzixiao.model.vo.SysUserQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
public interface LoginLogMapper extends BaseMapper<SysLoginLog> {

}
