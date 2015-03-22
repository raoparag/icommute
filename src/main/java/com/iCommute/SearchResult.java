package com.iCommute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchResult {

	@RequestMapping("/search")
	public SearchResultDTO search(@RequestParam(value = "searchCriteria") SearchCriteriaDTO searchCriteria) {
		SearchResultDTO searchResult = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://10.156.160.240:3306/icommute", "icommute_user", "icommute_user");

			PreparedStatement ps = conn.prepareStatement("select * from location_dtl");
			ResultSet rs = ps.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchResult;
	}
}
