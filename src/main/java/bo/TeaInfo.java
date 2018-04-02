package bo;

import java.util.List;

public class TeaInfo {
    int id_tea;
    List<StuInfo> stuInfos;

    public TeaInfo(int id_tea, List<StuInfo> stuInfos) {
        this.id_tea = id_tea;
        this.stuInfos = stuInfos;
    }

    public int getId_tea() {
        return id_tea;
    }

    public void setId_tea(int id_tea) {
        this.id_tea = id_tea;
    }

    public List<StuInfo> getStuInfos() {
        return stuInfos;
    }

    public void setStuInfos(List<StuInfo> stuInfos) {
        this.stuInfos = stuInfos;
    }
}
