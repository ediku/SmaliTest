package com.ediku.smalitest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("新加的一行develop");
		System.out.println("新加的一行develop2");
		System.out.println("新加的一行develop222");
		String a1="aa";
		  String a2="bb";
		  a1=a2;
		     
		  
		  Class1 class1= new Class1();
		  class1.staticName="ediku2";
		   String b4=class1.staticName;
		   
		   
		   class1.setName("ediku");
		   String b3=class1.getName();
		   
		   
	}
 
}
