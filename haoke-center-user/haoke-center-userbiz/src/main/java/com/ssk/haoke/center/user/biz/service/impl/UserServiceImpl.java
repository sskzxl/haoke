package com.ssk.haoke.center.user.biz.service.impl;

import org.springframework.stereotype.Service;
import com.ssk.haoke.center.user.biz.service.IUserService;
import com.github.pagehelper.PageInfo;
import com.ssk.haoke.center.user.dao.das.UserDas;
import com.dtyunxi.cube.commons.dto.DtoHelper;
import javax.annotation.Resource;
import com.ssk.haoke.center.user.api.dto.request.UserReqDto;
import com.ssk.haoke.center.user.dao.eo.UserEo;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSON;
import com.dtyunxi.cube.utils.bean.CubeBeanUtils;
import java.util.ArrayList;
import java.util.List;

/**
* 服务实现类
*
* @author 代码生成器
*/
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDas userDas;

    @Override
    public Long addUser(UserReqDto addReqDto) {
        UserEo userEo = new UserEo();
        DtoHelper.dto2Eo(addReqDto, userEo);
        userDas.insert(userEo);
        return userEo.getId();
    }

    @Override
    public void modifyUser(UserReqDto modifyReqDto) {
        UserEo userEo = new UserEo();
        DtoHelper.dto2Eo(modifyReqDto, userEo);
        userDas.updateSelective(userEo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void removeUser(String ids,
                                   Long instanceId) {
        String[] removeIds = ids.split(",");
        for (String id : removeIds) {
            userDas.logicDeleteById(Long.valueOf(id));
        }
    }

    @Override
    public UserReqDto queryById(Long id) {
        UserEo userEo = userDas.selectByPrimaryKey(id);
        UserReqDto userReqDto = new UserReqDto();
        DtoHelper.eo2Dto(userEo, userReqDto);
        return userReqDto;
    }

    @Override
    public PageInfo<UserReqDto> queryByPage(String filter,
                                                    Integer pageNum,
                                                    Integer pageSize) {
        UserReqDto userReqDto = JSON.parseObject(filter, UserReqDto.class);
        UserEo userEo = new UserEo();
        DtoHelper.dto2Eo(userReqDto, userEo);
        PageInfo<UserEo> eoPageInfo = userDas.selectPage(userEo, pageNum, pageSize);

        PageInfo<UserReqDto> dtoPageInfo = new PageInfo();
        CubeBeanUtils.copyProperties(dtoPageInfo, eoPageInfo, "list", "navigatepageNums");
        List<UserReqDto> dtoList = new ArrayList<>();
        DtoHelper.eoList2DtoList(eoPageInfo.getList(), dtoList, UserReqDto.class);
        dtoPageInfo.setList(dtoList);
        return dtoPageInfo;
    }

}
