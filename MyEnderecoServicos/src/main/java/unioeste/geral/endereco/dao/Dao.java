package unioeste.geral.endereco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	protected Connection connection;

    protected void setStatementValue(PreparedStatement statement, int index, Object object) throws SQLException {

        if(object == null)
            statement.setString(index, null);
        else if(object instanceof String)
            statement.setString(index, (String)object);
        else if(object instanceof Integer)
            statement.setInt(index, (int)object);
        else if(object instanceof Short)
            statement.setInt(index, (short)object);
        else if(object instanceof Long)
            statement.setLong(index, (long)object);
        else if(object instanceof Double)
            statement.setDouble(index, (double)object);
        else if(object instanceof Boolean)
            statement.setBoolean(index, (boolean)object);
    }

}
