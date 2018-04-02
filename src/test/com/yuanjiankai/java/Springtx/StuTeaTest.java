package com.yuanjiankai.java.Springtx;

import Dao.StuTeaMapper;
import bo.StuInfo;
import bo.TeaInfo;
import config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.StuTeaService;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class StuTeaTest {

    @Autowired
    private StuTeaService stuTeaService;

    @Test
    public void insertTest() {
        StuInfo stuInfo1 = new StuInfo(1,2);
        StuInfo stuInfo2 = new StuInfo(2,3);
        StuInfo stuInfo3 = new StuInfo(3,4);
        List<StuInfo> list = new ArrayList<StuInfo>();
        list.add(stuInfo1);
        list.add(stuInfo2);

        List<StuInfo> list2 = new ArrayList<StuInfo>();
        list2.add(stuInfo3);
        TeaInfo teaInfo1 = new TeaInfo(1, list);
        TeaInfo teaInfo2 = new TeaInfo(2, list2);

        List<TeaInfo> teaInfos = new ArrayList<TeaInfo>();
        teaInfos.add(teaInfo1);
        teaInfos.add(teaInfo2);
        stuTeaService.updateStuTeaRel(teaInfos);
    }
}
