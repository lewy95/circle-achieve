package cn.xzxy.lewy.circleachieve.service.impl;

import cn.xzxy.lewy.circleachieve.mapper.LogInterfaceMapper;
import cn.xzxy.lewy.circleachieve.pojo.LogInterfaceWithBLOBs;
import cn.xzxy.lewy.circleachieve.service.InterfaceLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class InterfaceLogServiceImpl implements InterfaceLogService {

    @Resource
    private LogInterfaceMapper logInterfaceMapper;

    @Override
    public int saveLog(LogInterfaceWithBLOBs logInterfaceWithBLOBs) {
        return logInterfaceMapper.insert(logInterfaceWithBLOBs);
    }
}
