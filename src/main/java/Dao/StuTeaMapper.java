package Dao;

import bo.TeaInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuTeaMapper {
    void insertStuTea(@Param("teaInfos") List<TeaInfo> teaInfos);
    void deleteStuTea(@Param("teaInfos") List<TeaInfo> teaInfos);
}
