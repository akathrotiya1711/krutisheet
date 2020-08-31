package com.th.krutisheelFamilyDetail.utility;

public class Valida {
	
	public static String convertName(String name) {
			name=name.trim();
			return name.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();
		}
	}


