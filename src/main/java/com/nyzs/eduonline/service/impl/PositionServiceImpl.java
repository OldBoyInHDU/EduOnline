package com.nyzs.eduonline.service.impl;

import com.nyzs.eduonline.bean.dto.PositionInfoDto;
import com.nyzs.eduonline.dao.PositionDao;
import com.nyzs.eduonline.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author ：RukiHuang
 * @description：岗位ServiceImpl
 * @date ：2022/9/13 7:59
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionDao positionDao;
    @Override
    public HashMap<String, List<PositionInfoDto>> getPositionList() throws Exception {
        List<PositionInfoDto> unitPianyePosList = positionDao.getPositionList("制叶");
        List<PositionInfoDto> unitHongsiPosList = positionDao.getPositionList("制丝");
        List<PositionInfoDto> unitCanpeijiaxiangPosList = positionDao.getPositionList("掺配加香");
        List<PositionInfoDto> unitPengzhangPosList = positionDao.getPositionList("膨胀");
        List<PositionInfoDto> unitGengsiPosList = positionDao.getPositionList("梗丝");
        List<PositionInfoDto> unitCanyanjianPosList = positionDao.getPositionList("残烟间");
        List<PositionInfoDto> unitTangliaochufangPosList = positionDao.getPositionList("糖料厨房");

        HashMap<String, List<PositionInfoDto>> positionMap = new HashMap<String, List<PositionInfoDto>>();
        positionMap.put("unit_pianye_posList", unitPianyePosList);
        positionMap.put("unit_hongsi_posList", unitHongsiPosList);
        positionMap.put("unit_canpeijiaxiang_posList", unitCanpeijiaxiangPosList);
        positionMap.put("unit_pengzhang_posList", unitPengzhangPosList);
        positionMap.put("unit_gengsi_posList", unitGengsiPosList);
        positionMap.put("unit_canyanjian_posList", unitCanyanjianPosList);
        positionMap.put("unit_tangliaochufang_posList", unitTangliaochufangPosList);
        return positionMap;
    }
}
