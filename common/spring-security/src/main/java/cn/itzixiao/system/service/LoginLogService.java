package cn.itzixiao.system.service;

import cn.itzixiao.model.system.SysLoginLog;
import cn.itzixiao.model.vo.SysLoginLogQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface LoginLogService {

    //登录日志
    public void recordLoginLog(String username,Integer status,
                               String ipaddr,String message);

    //条件分页查询登录日志
    IPage<SysLoginLog> selectPage(long page, long limit, SysLoginLogQueryVo sysLoginLogQueryVo);
}
