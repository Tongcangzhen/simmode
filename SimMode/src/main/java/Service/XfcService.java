package Service;

import DB.*;
import dao.xfcDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class XfcService implements xfcDao {
    public XfcContractEntity getXfcContract(String xfc) {
        Connection connection = DbUtil.getCon();
        XfcContractEntity xfcContractEntity = new XfcContractEntity();
        String sql="SELECT * FROM xfc_contract WHERE xfc= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, xfc);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                xfcContractEntity.setName(resultSet.getString("name"));
                xfcContractEntity.setXfc(resultSet.getString("xfc"));
                xfcContractEntity.setFusionmodel(resultSet.getString("fusionmodel"));
                xfcContractEntity.setStatus(resultSet.getString("status"));
                xfcContractEntity.setRemark(resultSet.getString("remark"));
            }
            resultSet.close();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return xfcContractEntity;
    }

    public List<XfcDatasourceEntity> getDataSources(String xfc,String xterm) {
        Connection connection = DbUtil.getCon();
        List<XfcDatasourceEntity> list = new ArrayList<XfcDatasourceEntity>();
        String sql="SELECT * FROM xfc_datasource WHERE xfc= ? AND xterm = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, xfc);
            preparedStatement.setString(2, xterm);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                XfcDatasourceEntity xfcDatasourceEntity = new XfcDatasourceEntity();
                xfcDatasourceEntity.setInstid(resultSet.getInt("instid"));
                xfcDatasourceEntity.setXfc(resultSet.getString("xfc"));
                xfcDatasourceEntity.setSds(resultSet.getString("sds"));
                xfcDatasourceEntity.setXterm(resultSet.getString("xterm"));
                xfcDatasourceEntity.setRemark(resultSet.getString("remark"));
                xfcDatasourceEntity.setXds(resultSet.getString("xds"));
                list.add(xfcDatasourceEntity);
            }
            resultSet.close();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<XfcSupportDsEntity> getSupports(String xfc, String sds) {
        Connection connection = DbUtil.getCon();
        List<XfcSupportDsEntity> list = new ArrayList<XfcSupportDsEntity>();
        String sql="SELECT * FROM xfc_support_ds WHERE xfc= ? AND sds=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, xfc);
            preparedStatement.setString(2, sds);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                XfcSupportDsEntity xfcDatasourceEntity = new XfcSupportDsEntity();
                xfcDatasourceEntity.setXfc(resultSet.getString("xfc"));
                xfcDatasourceEntity.setSds(resultSet.getString("sds"));
                xfcDatasourceEntity.setRemark(resultSet.getString("remark"));
                xfcDatasourceEntity.setParam(resultSet.getString("param"));
                list.add(xfcDatasourceEntity);
            }
            resultSet.close();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public String getPushApp(String xfc, String xtrem) {
        Connection connection = DbUtil.getCon();
        String appId=null;
        String sql="SELECT * FROM xfc_push WHERE xfc= ? AND xterm = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, xfc);
            preparedStatement.setString(2, xtrem);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            appId = resultSet.getString("xapp");
            resultSet.close();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appId;
    }


}
