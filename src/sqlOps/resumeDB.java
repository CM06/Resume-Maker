package sqlOps;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class resumeDB {

	public static void insertLoginDB(String name, String password) {
		try {
			Connection con = CP.createC();

			String q = "insert into login_info(username,password) values(?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String pass;

	public static boolean getLoginDB(String name) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "select password from login_info where username=?";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				pass = rs.getString("password");
				f = true;
			} else {
				f = false;
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertPersonalDB(String name, String email, String gender, Date date, String nationality,
			String add, String prof) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into personal_info(fname,email,gender,DOB,nationality,address,profession) values(?,?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, gender);
			pstmt.setDate(4, date);
			pstmt.setString(5, nationality);
			pstmt.setString(6, add);
			pstmt.setString(7, prof);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertAcademicsDB(String scl, int sclG, String jrc, int jrcG, String colg, int cgpa) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into academics(school_name,10th_percentage,jrc_name,12th_percentage,uni_name,cgpa) values(?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, scl);
			pstmt.setInt(2, sclG);
			pstmt.setString(3, jrc);
			pstmt.setInt(4, jrcG);
			pstmt.setString(5, colg);
			pstmt.setInt(6, cgpa);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertWorkDB(String jt1, String comp1) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into jobs(jt1, comp1) values(?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, jt1);
			pstmt.setString(2, comp1);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertWorkDB(String jt1, String comp1, String jt2, String comp2) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into jobs(jt1, comp1, jt2, comp2) values(?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, jt1);
			pstmt.setString(2, comp1);
			pstmt.setString(3, jt2);
			pstmt.setString(4, comp2);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertWorkDB(String jt1, String comp1, String jt2, String comp2, String jt3, String comp3) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into jobs(jt1, comp1, jt2, comp2, jt3, comp3) values(?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, jt1);
			pstmt.setString(2, comp1);
			pstmt.setString(3, jt2);
			pstmt.setString(4, comp2);
			pstmt.setString(5, jt3);
			pstmt.setString(6, comp3);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertSkillsDB(String s) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into skills(skill1) values(?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, s);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertSkillsDB(String s, String s1) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into skills(skill1,skill2) values(?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, s);
			pstmt.setString(2, s1);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertSkillsDB(String s, String s1, String s2) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into skills(skill1,skill2,skill3) values(?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, s);
			pstmt.setString(2, s1);
			pstmt.setString(3, s2);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertSkillsDB(String s, String s1, String s2, String s3) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into skills(skill1,skill2,skill3,skill4) values(?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, s);
			pstmt.setString(2, s1);
			pstmt.setString(3, s2);
			pstmt.setString(4, s3);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertImageIntoDatabase(File imageFile) {
		boolean f = false;
		try {
			// Read the image file into a byte array
			FileInputStream fis = new FileInputStream(imageFile);
			byte[] imageData = fis.readAllBytes();
			fis.close();

			// Insert the image into the database
			Connection con = CP.createC();
			String sql = "INSERT INTO pic (img) VALUES (?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setBytes(1, imageData);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			f = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}

}
