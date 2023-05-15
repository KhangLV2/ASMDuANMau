/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repository;

import DomainModels.ChucVu;
import Utilites.DBConnection;
import ViewModels.QLChucVu;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Lê Chấn Khang
 */
public class ChucVuRepository {

    private DBConnection conection = new DBConnection();
    
    
    public ArrayList<QLChucVu> getList(){
        ArrayList<QLChucVu> list = new ArrayList<>();
        String sql = "select * from ChucVu";
        try(Connection con = conection.getConnection();
                PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                while (rs.next()) {                
                QLChucVu chucVu = new QLChucVu();
                chucVu.setId(rs.getString(1));
                chucVu.setMa(rs.getString(2));
                chucVu.setTen(rs.getString(3));
                list.add(chucVu);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
