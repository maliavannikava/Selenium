package com.class02;

public class SChromeDriver implements SWebDriver{
		
		public SChromeDriver() {
			System.err.println("Opening Chrome Browser...");
	}

		@Override
		public void get(String url) {
			System.out.println("Launching chrome browser");
		}

		@Override
		public void getCurrentUrl() {
			System.out.println("Current url is ");
		}

		@Override
		public void close() {
			
		}

		@Override
		public void getTitle() {
			System.out.println("Title is ");
		}
}
