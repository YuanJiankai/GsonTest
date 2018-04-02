package service.impl;

import Dao.StuTeaMapper;
import bo.TeaInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import service.StuTeaService;

import java.util.List;

@Service("stuTeaService")
@Transactional
public class StuTeaServiceImpl implements StuTeaService {

    @Autowired(required = false)
    private StuTeaMapper stuTeaMapper;

    @Override
    public void updateStuTeaRel(List<TeaInfo> teaInfos) {
        try {
            stuTeaMapper.insertStuTea(teaInfos);
            stuTeaMapper.deleteStuTea(teaInfos);
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            e.printStackTrace();
        }
    }
}
