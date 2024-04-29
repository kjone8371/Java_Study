//package database_user_service.dao;
//
//import database_user_service.user.User;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserDAO {
//
//    //1.insert
//    public int insertData(User dto){
//        int result = 0;
//
//        Connection conn = DBConn.getConnection();
//        PreparedStatement pstmt = null;
//        String sql;
//
//
//        try {
//
//            sql = "insert into naverMember (id,pw,name,gender,birth,email,tel) ";
//            sql+= "values (?,?,?,?,?,?,?)";
//
//            pstmt = conn.prepareStatement(sql);
//
//            pstmt.setString(1, dto.getId());
//            pstmt.setString(2, dto.getEmail());
//            pstmt.setString(3, dto.getPassword());
//            pstmt.setString(4, dto.getName());
//            pstmt.setString(5, dto.getGender());
//            pstmt.setInt(6, dto.getAge());
//            pstmt.setString(7, dto.getCommunity());
//            pstmt.setString(8, dto.getInformation());
//
//            result = pstmt.executeUpdate();
//
//            pstmt.close();
//
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//
//        return result;
//    }
//
//    //2.update
//
//    public int updateData(User dto){
//        int result = 0;
//
//        Connection conn = DBConn.getConnection();
//        PreparedStatement pstmt = null;
//        String sql;
//        try {
//
//            sql = "update naverMember set pw=?, email=?, tel=? ";
//
//            sql+= "where id=?";
//            pstmt = conn.prepareStatement(sql);
//
//            pstmt.setString(1, dto.getId());
//
//            pstmt.setString(2, dto.getEmail());
//
//            pstmt.setString(3, dto.getPassword());
//
//            pstmt.setString(4, dto.getInformation());
//
//            result = pstmt.executeUpdate();
//
//            pstmt.close();
//
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//        return result;
//    }
//
//
//
//
//
//    //3.delete
//
//    public int deleteDate(String id, String pw){
//
//
//
//        int result = 0;
//
//
//
//        Connection conn = DBConn.getConnection();
//
//        PreparedStatement pstmt = null;
//
//        String sql;
//
//
//
//        try {
//
//            sql = "delete naverMember where id=? and pw=?";
//
//
//
//            pstmt = conn.prepareStatement(sql);
//
//
//
//            pstmt.setString(1, id);
//
//            pstmt.setString(2, pw);
//
//
//
//            result = pstmt.executeUpdate();
//
//
//
//            pstmt.close();
//
//
//
//        } catch (Exception e) {
//
//            System.out.println(e.toString());
//
//        }
//
//
//
//        return result;
//
//
//
//    }
//
//
//
//
//
//    //4.selectAll
//
//    public List<User> getList() {
//
//
//
//        List<User> lists = new ArrayList<User>();
//
//        Connection conn = DBConn.getConnection();
//
//        PreparedStatement pstmt = null;
//
//        ResultSet rs = null;
//
//        String sql;
//
//
//
//        try {
//
//            sql = "select id,email, password,name,gender,age, community, information ";
//
//            sql+= "from naverMember order by name";
//
//
//
//            pstmt = conn.prepareStatement(sql);
//
//
//
//            rs = pstmt.executeQuery();
//
//
//
//            while(rs.next()){
//
//
//
//                User dto = new User();
//
//
//
//                dto.setId(rs.getString("id"));
//
//                dto.setPw(rs.getString("pw"));
//
//                dto.setName(rs.getString("name"));
//
//                dto.setGender(rs.getString("gender"));
//
//                dto.setBirth(rs.getString("birth"));
//
//                dto.setEmail(rs.getString("email"));
//
//                dto.setTel(rs.getString("tel"));
//
//                lists.add(dto);
//            }
//
//            rs.close();
//
//            pstmt.close();
//
//
//
//        } catch (Exception e) {
//
//            System.out.println(e.toString());
//
//        }
//
//        return lists;
//    }
//
//    //5.searchId
//    public List<User> getList(String id){
//
//        List<User> lists = new ArrayList<User>();
//        Connection conn = DBConn.getConnection();
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        String sql;
//
//        try{
//
//            sql = "select id,pw,name,gender,birth,email,tel ";
//
//            sql+= "from naverMember where id=?";
//
//
//
//            pstmt = conn.prepareStatement(sql);
//
//
//
//            pstmt.setString(1, id);
//
//
//
//            rs = pstmt.executeQuery();
//
//
//
//            while(rs.next()){
//                User dto = new User();
//
//                dto.setId(rs.getString("id"));
//
//                dto.setPw(rs.getString("pw"));
//
//                dto.setName(rs.getString("name"));
//
//                dto.setGender(rs.getString("gender"));
//
//                dto.setBirth(rs.getString("birth"));
//
//                dto.setEmail(rs.getString("email"));
//
//                dto.setTel(rs.getString("tel"));
//                lists.add(dto);
//            }
//            rs.close();
//
//            pstmt.close();
//
//        }catch (Exception e) {
//
//            System.out.println(e.toString());
//        }
//
//        return lists;
//    }
//}