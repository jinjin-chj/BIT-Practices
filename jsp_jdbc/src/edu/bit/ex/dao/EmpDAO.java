package edu.bit.ex.dao;

import java.sql.*;
import java.util.ArrayList;

import edu.bit.ex.vo.EmpVO;

public class EmpDAO {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �⺻������ �� 3�� �⺻������ ����
	private String uid = "scott";
	private String upw = "tiger";

	public EmpDAO() { // ������ ����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
		}
	}

	public ArrayList<EmpVO> empSelect() {
		ArrayList<EmpVO> dtos = new ArrayList<EmpVO>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp order by ename"); // �ش� �����͸� ���� ��

			while (rs.next()) {
				String ename = rs.getString("ename");
				int empno = rs.getInt("empno");
				String job = rs.getString("job");

				EmpVO eDto = new EmpVO(ename, empno, job);
				dtos.add(eDto); // ��� ����Ʈ�� ����
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}

}