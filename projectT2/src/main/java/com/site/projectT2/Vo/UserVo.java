package com.site.projectT2.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserVo {

	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
}
