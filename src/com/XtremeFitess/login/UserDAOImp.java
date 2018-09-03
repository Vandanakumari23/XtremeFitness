package com.XtremeFitess.login;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDAOImp implements UserDAO{
  @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;
  public void register(User user) {
    String sql = "insert into users values(?,?,?,?,?,?,?)";
    jdbcTemplate.update(sql, new Object[] {
    		user.getName(), user.getPassword(), user.getConfirm_password(),
    user.getEmail() });
    }
    public User validateUser(Login login) {
    String sql = "select * from users where username='" + login.getEmail() + "' and password='" + login.getPassword()
    + "'";
    List<User> users = jdbcTemplate.query(sql, new UserMapper());
    return users.size() > 0 ? users.get(0) : null;
    }
  }
  class UserMapper implements RowMapper<User> {
  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();
    user.setName(rs.getString("name"));
    user.setPassword(rs.getString("password"));
    user.setConfirm_password(rs.getString("firstname"));
   
    user.setEmail(rs.getString("email"));
    
    return user;
  }
}