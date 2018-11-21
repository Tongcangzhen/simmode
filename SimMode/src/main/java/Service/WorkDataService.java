package Service;

import DB.DbUtil;
import SimBusiness.WorkData;
import dao.WorkDataDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WorkDataService implements WorkDataDao {
    public int deleteWorkData(WorkData workData) {
        Connection connection = DbUtil.getCon();
        String sql="DELETE FROM work_data where id= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, workData.getId());
            preparedStatement.execute();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

        return 1;
    }

    public int updateWorkData(WorkData workData) {
        return 0;
    }

    public int addXtransToWorkData(WorkData workData) {
        Connection connection = DbUtil.getCon();
        String sql="update  work_data SET xtrans= ? where id= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, workData.getXtrans());
            preparedStatement.setInt(2, workData.getId());
            preparedStatement.execute();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

        return 1;
    }

    public List<WorkData> SelectWorkData() {
        Connection connection = DbUtil.getCon();
        List<WorkData> list = new ArrayList<WorkData>();
        String sql="SELECT * FROM work_data";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                WorkData a = new WorkData();
                a.setId(resultSet.getInt("id"));
                a.setXtrans(resultSet.getString("xtrans"));
                a.setXfc(resultSet.getString("xfc"));
                a.setAppid(resultSet.getString("appid"));
                a.setTerm(resultSet.getString("term"));
                a.setParam(resultSet.getString("param"));
                list.add(a);
            }
            resultSet.close();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public WorkData SelectWorkData(int id) {
        return null;
    }

    public int insertWorkData(WorkData workData) {
        Connection connection = DbUtil.getCon();
        String sql="INSERT INTO  work_data (xtrans, xfc, appid, term,param) VALUE (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, workData.getXtrans());
            preparedStatement.setString(2, workData.getXfc());
            preparedStatement.setString(3,workData.getAppid());
            preparedStatement.setString(4,workData.getTerm());
            preparedStatement.setString(5,workData.getParam());
            preparedStatement.execute();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

        return 1;
    }
}
