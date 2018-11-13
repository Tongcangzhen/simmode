package dao;

import SimBusiness.WorkData;

import java.util.List;

public interface WorkDataDao {
    int deleteWorkData(WorkData workData);

    int updateWorkData(WorkData workData);

    int addXtransToWorkData(WorkData workData);

    List<WorkData> SelectWorkData();

    WorkData SelectWorkData(int id);

    int insertWorkData(WorkData workData);

}
