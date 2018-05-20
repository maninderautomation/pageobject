package com.amazon.pageobjectrepositry;


	import com.amzon.generic.BaseClass;

	public class TestUtils extends BaseClass{
		
		public static long Page_load_Timeout =20;
		public static long Implicity_WAIT =10;
		
		public void switchtoFrame() {
			driver.switchTo().frame("mainpanel");
		}

	}



