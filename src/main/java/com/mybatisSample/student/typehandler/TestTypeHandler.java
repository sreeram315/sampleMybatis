package com.mybatisSample.student.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestTypeHandler extends BaseTypeHandler<Integer> {
    private final Logger LOG = LoggerFactory.getLogger(TestTypeHandler.class);

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Integer parameter, JdbcType jdbcType) throws SQLException {
        LOG.info("setNonNullParameter");
        ps.setObject(i, 1);
    }

    @Override
    public Integer getNullableResult(ResultSet rs, String columnName) throws SQLException {
        LOG.info("getNullableResult");
        return 1;
    }

    @Override
    public Integer getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        LOG.info("getNullableResult");
        return 1;
    }

    @Override
    public Integer getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        LOG.info("getNullableResult");
        return 1;
    }
}
