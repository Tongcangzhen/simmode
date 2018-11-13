package Service;

import DB.DbUtil;
import DB.XtransInfoEntity;
import DB.XtransLogEntity;
import dao.XtransDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class XtransService implements XtransDao {

    public int inscertInfo(XtransInfoEntity xtransInfoEntity) {
        Connection connection = DbUtil.getCon();
        String sql="INSERT INTO  xtrans_info (xtrans, xfc, triggerappid, trigerterm, createdt, status, lastupdate, remark) VALUE (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, xtransInfoEntity.getXtrans());
            preparedStatement.setString(2, xtransInfoEntity.getXfc());
            preparedStatement.setString(3,xtransInfoEntity.getTriggerappid());
            preparedStatement.setString(4,xtransInfoEntity.getTrigerterm());
            preparedStatement.setTimestamp(5,xtransInfoEntity.getCreatedt());
            preparedStatement.setString(6,xtransInfoEntity.getStatus());
            preparedStatement.setTimestamp(7,xtransInfoEntity.getLastupdate());
            preparedStatement.setString(8, xtransInfoEntity.getRemark());
            preparedStatement.execute();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

         return 1;
    }


    public int updateInfo(String xtrrans,String status) {
        Connection connection = DbUtil.getCon();
        String sql="update  xtrans_info SET status= ? where xtrans= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);
            preparedStatement.setString(2, xtrrans);
            preparedStatement.execute();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

        return 1;
    }

    public int inscertLog(XtransLogEntity xtransLogEntity) {
        Connection connection = DbUtil.getCon();
        String sql="INSERT INTO  xtrans_log ( xtrans, createdt, xfc, xterm, xstatus, operation, agent, coordtype, coordentityid, remark)  VALUE (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, xtransLogEntity.getXtrans());
            preparedStatement.setString(3, xtransLogEntity.getXfc());
            preparedStatement.setString(6,xtransLogEntity.getOperation());
            preparedStatement.setString(4,xtransLogEntity.getXterm());
            preparedStatement.setTimestamp(2,xtransLogEntity.getCreatedt());
            preparedStatement.setString(5,xtransLogEntity.getXstatus());
            preparedStatement.setString(7,xtransLogEntity.getAgent());
            preparedStatement.setString(8, xtransLogEntity.getCoordtype());
            preparedStatement.setString(9,xtransLogEntity.getCoordentityid());
            preparedStatement.setString(10, xtransLogEntity.getRemark());
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
